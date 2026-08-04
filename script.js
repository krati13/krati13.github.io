/* =============================================================================
   HelloNexa — Renderer
   Builds the page from window.SITE_CONFIG (see config.js).
   You normally do NOT need to edit this file to change content.
   ========================================================================== */
(function () {
  "use strict";

  var C = window.SITE_CONFIG || {};

  /* ---- tiny helpers ------------------------------------------------------ */
  function el(tag, cls, html) {
    var e = document.createElement(tag);
    if (cls) e.className = cls;
    if (html != null) e.innerHTML = html;
    return e;
  }
  function esc(s) {
    return String(s == null ? "" : s)
      .replace(/&/g, "&amp;").replace(/</g, "&lt;").replace(/>/g, "&gt;");
  }
  function linkFor(label) {
    var b = C.brand || {};
    if (/mentorship|book|1:1/i.test(label)) return b.mentorshipLink || ("mailto:" + (b.email || ""));
    if (/corporate|training/i.test(label)) return b.corporateLink || ("mailto:" + (b.email || ""));
    return "#contact";
  }
  function chipList(items) {
    var wrap = el("ul", "chips");
    (items || []).forEach(function (i) { wrap.appendChild(el("li", "chip", esc(i))); });
    return wrap;
  }
  function checkList(items) {
    var wrap = el("ul", "checklist");
    (items || []).forEach(function (i) { wrap.appendChild(el("li", null, esc(i))); });
    return wrap;
  }
  function sectionHead(eyebrow, title, desc) {
    var h = el("div", "section-head");
    if (eyebrow) h.appendChild(el("span", "eyebrow", esc(eyebrow)));
    if (title) h.appendChild(el("h2", null, esc(title)));
    if (desc) h.appendChild(el("p", "section-desc", esc(desc)));
    return h;
  }
  function ctaButton(label, primary) {
    var a = el("a", "btn " + (primary ? "btn-primary" : "btn-secondary"), esc(label));
    a.href = linkFor(label);
    return a;
  }
  /* ---- brand + nav ------------------------------------------------------- */
  function renderBrandAndNav() {
    var b = C.brand || {};
    document.title = (b.name || "Website") + (b.tagline ? " — " + b.tagline : "");
    var brand = document.getElementById("brand-name");
    if (brand) brand.textContent = b.name || "";

    var nav = document.getElementById("nav-links");
    if (nav) {
      nav.innerHTML = "";
      (C.nav || []).forEach(function (n) {
        var a = el("a", null, esc(n.label));
        a.href = "#" + n.target;
        a.addEventListener("click", function () { nav.classList.remove("open"); });
        nav.appendChild(a);
      });
    }
    var toggle = document.getElementById("nav-toggle");
    if (toggle && nav) {
      toggle.addEventListener("click", function () { nav.classList.toggle("open"); });
    }
    window.addEventListener("scroll", function () {
      var h = document.getElementById("site-header");
      if (h) h.classList.toggle("scrolled", window.scrollY > 10);
    });

    // auth area (google sign-in button / user badge)
    try {
      var headerInner = document.querySelector('#site-header .nav-inner');
      if (headerInner && !document.getElementById('auth-area')) {
        var aa = document.createElement('div'); aa.id = 'auth-area'; aa.className = 'auth-area'; headerInner.appendChild(aa);
      }
    } catch(e) {}
  }

  /* ---- sections ---------------------------------------------------------- */
  function renderHero() {
    var d = C.hero || {};
    var s = el("section", "hero"); s.id = "hero";
    var inner = el("div", "container hero-inner");
    inner.appendChild(el("h1", "hero-title", esc(d.headline)));
    inner.appendChild(el("p", "hero-sub", esc(d.subheading)));
    var btns = el("div", "btn-row");
    if (d.primaryButton) btns.appendChild(ctaButton(d.primaryButton, true));
    if (d.secondaryButton) btns.appendChild(ctaButton(d.secondaryButton, false));
    inner.appendChild(btns);
    s.appendChild(inner);
    return s;
  }

  function renderTrustedBy() {
    var d = C.trustedBy || {};
    if (d.show === false) return null;
    var s = el("section", "trusted"); s.id = "trusted";
    var inner = el("div", "container");
    inner.appendChild(el("p", "trusted-text", esc(d.text)));
    var logos = el("div", "logo-row");
    (d.companies || []).forEach(function (c) { logos.appendChild(el("span", "logo-pill", esc(c))); });
    inner.appendChild(logos);
    s.appendChild(inner);
    return s;
  }

  function renderMentorship() {
    var d = C.mentorship || {};
    var s = el("section", "section"); s.id = "mentorship";
    var inner = el("div", "container");
    inner.appendChild(sectionHead(d.eyebrow, d.title, d.description));
    var grid = el("div", "two-col");
    var c1 = el("div", "card");
    c1.appendChild(el("h3", null, esc(d.learnTitle)));
    c1.appendChild(chipList(d.learn));
    var c2 = el("div", "card");
    c2.appendChild(el("h3", null, esc(d.includedTitle)));
    c2.appendChild(checkList(d.included));
    grid.appendChild(c1); grid.appendChild(c2);
    inner.appendChild(grid);
    s.appendChild(inner);
    return s;
  }

  function renderCorporate() {
    var d = C.corporate || {};
    var s = el("section", "section alt"); s.id = "corporate";
    var inner = el("div", "container");
    inner.appendChild(sectionHead(d.eyebrow, d.title, d.description));
    var grid = el("div", "two-col");
    var c1 = el("div", "card");
    c1.appendChild(el("h3", null, esc(d.programsTitle)));
    c1.appendChild(chipList(d.programs));
    var c2 = el("div", "card");
    c2.appendChild(el("h3", null, esc(d.formatsTitle)));
    c2.appendChild(chipList(d.formats));
    grid.appendChild(c1); grid.appendChild(c2);
    inner.appendChild(grid);
    s.appendChild(inner);
    return s;
  }

  function renderWhy() {
    var d = C.why || {};
    var s = el("section", "section"); s.id = "why";
    var inner = el("div", "container");
    inner.appendChild(sectionHead(d.eyebrow, d.title, d.description));
    var card = el("div", "card");
    card.appendChild(el("h3", null, esc(d.approachTitle)));
    card.appendChild(chipList(d.approach));
    inner.appendChild(card);
    s.appendChild(inner);
    return s;
  }

  function renderCourses() {
    var d = C.courses || {};
    var s = el("section", "section alt"); s.id = "courses";
    var inner = el("div", "container");
    inner.appendChild(sectionHead(d.eyebrow, d.title, d.description));
    var grid = el("div", "course-grid");
    (d.items || []).forEach(function (co) {
      var card = el("div", "card course-card");
      card.appendChild(el("h3", null, esc(co.name)));
      if (co.description) card.appendChild(el("p", null, esc(co.description)));
      if (co.topics && co.topics.length) card.appendChild(chipList(co.topics));
      grid.appendChild(card);
    });
    inner.appendChild(grid);
    s.appendChild(inner);
    return s;
  }

  function renderMetrics() {
    var d = C.metrics || {};
    if (d.show === false) return null;
    var s = el("section", "metrics"); s.id = "metrics";
    var inner = el("div", "container metrics-grid");
    (d.items || []).forEach(function (m) {
      var box = el("div", "metric");
      box.appendChild(el("div", "metric-value", esc(m.value)));
      box.appendChild(el("div", "metric-label", esc(m.label)));
      inner.appendChild(box);
    });
    s.appendChild(inner);
    return s;
  }

  function renderTestimonials() {
    var d = C.testimonials || {};
    var s = el("section", "section"); s.id = "testimonials";
    var inner = el("div", "container");
    inner.appendChild(sectionHead(d.eyebrow, d.title));
    var grid = el("div", "two-col");
    (d.items || []).forEach(function (t) {
      var card = el("figure", "card quote-card");
      card.appendChild(el("blockquote", null, "&ldquo;" + esc(t.quote) + "&rdquo;"));
      if (t.author) card.appendChild(el("figcaption", null, "— " + esc(t.author)));
      grid.appendChild(card);
    });
    inner.appendChild(grid);
    s.appendChild(inner);
    return s;
  }

  function renderClients() {
    var d = C.clients || {};
    var s = el("section", "section alt"); s.id = "clients";
    var inner = el("div", "container");
    inner.appendChild(sectionHead(d.eyebrow, d.title));
    var grid = el("div", "two-col");
    (d.groups || []).forEach(function (g) {
      var card = el("div", "card");
      card.appendChild(el("h3", null, esc(g.name)));
      card.appendChild(chipList(g.items));
      grid.appendChild(card);
    });
    inner.appendChild(grid);
    s.appendChild(inner);
    return s;
  }

  function renderFaq() {
    var d = C.faq || {};
    var s = el("section", "section"); s.id = "faq";
    var inner = el("div", "container");
    inner.appendChild(sectionHead(d.eyebrow, d.title));
    var list = el("div", "faq-list");
    (d.items || []).forEach(function (f) {
      var item = el("details", "faq-item");
      var sum = el("summary", null, esc(f.q));
      item.appendChild(sum);
      item.appendChild(el("p", null, esc(f.a)));
      list.appendChild(item);
    });
    inner.appendChild(list);
    s.appendChild(inner);
    return s;
  }

  function renderFinalCta() {
    var d = C.finalCta || {};
    var contact = C.contact || null;
    var s = el("section", contact ? "section" : "final-cta"); s.id = "contact";
    var inner = el("div", contact ? "container" : "container final-cta-inner");

    if (contact) {
      inner.appendChild(sectionHead(null, d.title, d.description));
      var grid = el("div", "two-col");

      // Left: contact form
      var formCard = el("div", "card");
      var form = document.createElement("form");
      (contact.formFields || []).forEach(function (f) {
        var wrap = el("div");
        var label = el("label", null, esc(f));
        label.style.display = "block";
        label.style.marginBottom = "6px";
        var input;
        if (f === "Message") {
          input = document.createElement("textarea");
          input.rows = 5;
          input.name = f;
          input.placeholder = "Tell us about your goals or requirements...";
        } else if (f === "I am interested in") {
          input = document.createElement("select");
          input.name = f;
          (contact.interests || []).forEach(function (opt) { var o = document.createElement("option"); o.value = opt; o.textContent = opt; input.appendChild(o); });
        } else {
          input = document.createElement("input");
          input.type = "text"; input.name = f;
        }
        wrap.appendChild(label); wrap.appendChild(input); form.appendChild(wrap);
      });

      var submit = el("button", "btn btn-primary", esc(contact.bookButton || d.primaryButton || "Send Message"));
      submit.type = "button";
      submit.addEventListener("click", function () {
        var parts = [];
        (contact.formFields || []).forEach(function (f) {
          var eln = form.querySelector('[name="' + f + '"]');
          if (eln) parts.push(f + ': ' + (eln.value || ''));
        });
        var body = encodeURIComponent(parts.join("\n"));
        var to = contact.email || (C.brand && C.brand.email) || '';
        window.location.href = 'mailto:' + to + '?subject=' + encodeURIComponent('Contact from website') + '&body=' + body;
      });
      form.appendChild(submit);
      formCard.appendChild(form);
      grid.appendChild(formCard);

      // Right: contact info
      var infoCard = el("div", "card");
      infoCard.appendChild(el("h3", null, "Contact Information"));
      if (contact.email) infoCard.appendChild(el("p", null, "✉ " + esc(contact.email)));
      if (contact.phone) infoCard.appendChild(el("p", null, "📞 " + esc(contact.phone)));
      if (contact.location) infoCard.appendChild(el("p", null, "📍 " + esc(contact.location)));
      if (contact.hours) infoCard.appendChild(el("p", null, "🕘 " + esc(contact.hours)));
      var btnRow = el("div", "btn-row");
      if (contact.bookButton) btnRow.appendChild(ctaButton(contact.bookButton, true));
      if (contact.corporateButton) btnRow.appendChild(ctaButton(contact.corporateButton, false));
      infoCard.appendChild(btnRow);
      grid.appendChild(infoCard);

      inner.appendChild(grid);
    } else {
      inner.appendChild(el("h2", null, esc(d.title)));
      inner.appendChild(el("p", null, esc(d.description)));
      var btns = el("div", "btn-row center");
      if (d.primaryButton) btns.appendChild(ctaButton(d.primaryButton, true));
      if (d.secondaryButton) btns.appendChild(ctaButton(d.secondaryButton, false));
      inner.appendChild(btns);
    }

    s.appendChild(inner);
    return s;
  }

  function renderFooter() {
    var f = C.footer || {}, b = C.brand || {};
    var foot = document.getElementById("site-footer");
    if (!foot) return;
    var inner = el("div", "container footer-inner");

    var col1 = el("div", "footer-col");
    col1.appendChild(el("div", "footer-brand", esc(b.name)));
    if (b.tagline) col1.appendChild(el("p", "footer-tagline", esc(b.tagline)));

    var col2 = el("div", "footer-col");
    col2.appendChild(el("h4", null, esc(f.contactTitle || "Contact")));
    if (f.contactText) col2.appendChild(el("p", null, esc(f.contactText)));
    if (b.email) {
      var mail = el("a", "footer-link", esc(b.email));
      mail.href = "mailto:" + b.email;
      col2.appendChild(mail);
    }

    var col3 = el("div", "footer-col");
    var social = C.brand && C.brand.social || {};
    var socialRow = el("div", "social-row");
    [["LinkedIn", social.linkedin], ["Topmate", social.topmate], ["Twitter", social.twitter], ["YouTube", social.youtube]]
      .forEach(function (pair) {
        if (pair[1]) {
          var a = el("a", "social-link", esc(pair[0]));
          a.href = pair[1]; a.target = "_blank"; a.rel = "noopener";
          socialRow.appendChild(a);
        }
      });
    if (socialRow.children.length) { col3.appendChild(el("h4", null, "Follow")); col3.appendChild(socialRow); }

    inner.appendChild(col1); inner.appendChild(col2); inner.appendChild(col3);
    foot.appendChild(inner);

    var bar = el("div", "footer-bar");
    bar.appendChild(el("div", "container",
      "&copy; " + new Date().getFullYear() + " " + esc(f.copyright || (b.name || ""))));
    foot.appendChild(bar);
  }

  /* ---- Auth helpers (Google Sign-In) ------------------------------------ */
  function decodeJwt (tok) {
    try { var pl = tok.split('.')[1]; pl = pl.replace(/-/g,'+').replace(/_/g,'/'); while (pl.length % 4) { pl += '='; } return JSON.parse(atob(pl)); } catch (e) { return null; }
  }
  function handleGoogleCredential(resp) {
    var payload = decodeJwt(resp && resp.credential ? resp.credential : '');
    if (payload) {
      C.currentUser = { name: payload.name, email: payload.email, picture: payload.picture };
      renderAuthState();
    }
  }
  function renderAuthState() {
    var authArea = document.getElementById('auth-area');
    if (!authArea) return;
    if (C.currentUser) {
      authArea.innerHTML = '<div class="user-badge"><img src="'+esc(C.currentUser.picture||'')+'" alt="" class="avatar"/><span class="user-name">'+esc(C.currentUser.name||C.currentUser.email||'User')+'</span> <button id="signout-btn" class="btn">Sign out</button></div>';
      var btn = document.getElementById('signout-btn');
      if (btn) btn.addEventListener('click', function(){ C.currentUser=null; if (window.google && google.accounts && google.accounts.id) try { google.accounts.id.disableAutoSelect(); } catch(e){}; initAuth(); });
    } else {
      authArea.innerHTML = '<div id="google-signin-button"></div>';
      if (window.google && google.accounts && google.accounts.id && C.auth && C.auth.google_client_id) {
        google.accounts.id.renderButton(document.getElementById('google-signin-button'), { theme: 'outline', size: 'medium' });
      }
    }
  }
  function initAuth() {
    var cfg = C.auth || {};
    if (!cfg.google_client_id || !(window.google && google.accounts && google.accounts.id)) return;
    if (!document.getElementById('auth-area')) {
      var headerInner = document.querySelector('#site-header .nav-inner');
      if (headerInner) { var aa = document.createElement('div'); aa.id = 'auth-area'; aa.className='auth-area'; headerInner.appendChild(aa); }
    }
    // initialize Google ID
    try { google.accounts.id.initialize({ client_id: cfg.google_client_id, callback: handleGoogleCredential }); } catch (e) {}
    renderAuthState();
  }

  /* ---- Blog helpers & rendering ----------------------------------------- */
  function stripHtml(html) {
    var tmp = document.createElement('div'); tmp.innerHTML = html || ''; return tmp.textContent || tmp.innerText || '';
  }
  function excerpt(html, n) { return stripHtml(html).slice(0, n || 200) + (stripHtml(html).length > n ? '…' : ''); }

  function renderBlogList(posts) {
    var list = el('div', 'blog-list');
    if (!posts || posts.length === 0) { list.appendChild(el('p', null, 'No posts yet.')); return list; }
    posts.forEach(function (p) {
      var card = el('article', 'card');
      var h = el('h3', null, esc(p.title));
      var a = el('a', null, 'Read more'); a.href = '#blog/' + encodeURIComponent(p.slug);
      card.appendChild(h);
      if (p.date) card.appendChild(el('div', 'meta', esc(p.date)));
      if (p.keywords && p.keywords.length) card.appendChild(el('div', 'tag-row', p.keywords.map(function(k){return '<span class="tag">'+esc(k)+'</span>'; }).join(' ')));
      card.appendChild(el('p', null, esc(excerpt(p.content, 220))));
      card.appendChild(a);
      list.appendChild(card);
    });
    return list;
  }

  function renderBlogPost(slug) {
    var posts = C.blogPosts || [];
    var p = posts.find(function (x) { return x.slug === slug; });
    if (!p) return el('div', null, 'Post not found');
    var s = el('section', 'section'); s.id = 'blog-post';
    var inner = el('div', 'container');
    inner.appendChild(el('h1', null, esc(p.title)));
    inner.appendChild(el('div', 'meta', esc(p.date || '') + ' — ' + esc(p.author || (C.brand && C.brand.author || ''))));
    var content = el('div', 'card blog-post-content'); content.innerHTML = p.content || '';
    inner.appendChild(content);
    s.appendChild(inner);
    return s;
  }

  function computeTrending(posts, topN) {
    var freq = {};
    (posts || []).forEach(function(p){ (p.keywords||[]).forEach(function(k){ k = k.toLowerCase(); freq[k] = (freq[k]||0)+1 }); });
    return Object.keys(freq).sort(function(a,b){ return freq[b]-freq[a]; }).slice(0, topN || 8);
  }

  function renderBlogSection() {
    var s = el('section', 'section'); s.id = 'blog';
    var inner = el('div', 'container');
    inner.appendChild(sectionHead('Blog', 'From the blog', 'Latest articles and insights'));

    // Search + trending
    var controls = el('div', 'card');
    var searchWrap = el('div');
    var input = document.createElement('input'); input.type = 'search'; input.placeholder = 'Search posts...'; input.className = 'search-input';
    searchWrap.appendChild(input);
    controls.appendChild(searchWrap);

    var trending = computeTrending(C.blogPosts || [], 8);
    if (trending.length) {
      var tdom = el('div', 'tag-row');
      trending.forEach(function (k) { var chip = el('button', 'tag', esc(k)); chip.type='button'; chip.addEventListener('click', function(){ applyFilter(k); }); tdom.appendChild(chip); });
      controls.appendChild(el('h4', null, 'Trending'));
      controls.appendChild(tdom);
    }

    inner.appendChild(controls);

    var listWrap = el('div'); listWrap.id = 'blog-list-wrap';
    var allPosts = C.blogPosts || [];
    var initialPosts = allPosts.slice(0,3);
    listWrap.appendChild(renderBlogList(initialPosts));
    inner.appendChild(listWrap);
    if ((allPosts || []).length > 3) {
      var seeMoreWrap = el('div', 'center');
      var seeMoreBtn = el('button', 'btn btn-secondary', 'See More Blogs');
      seeMoreBtn.type = 'button';
      seeMoreBtn.addEventListener('click', function(){
        document.getElementById('blog-list-wrap').innerHTML = '';
        document.getElementById('blog-list-wrap').appendChild(renderBlogList(allPosts));
        seeMoreBtn.style.display = 'none';
      });
      seeMoreWrap.appendChild(seeMoreBtn);
      inner.appendChild(seeMoreWrap);
    }

    // Create blog form (download markdown)
    inner.appendChild(renderCreateBlogForm());

    s.appendChild(inner);

    // Search behavior
    input.addEventListener('input', function(){ var q = input.value.toLowerCase(); var filtered = (C.blogPosts||[]).filter(function(p){ return (p.title||'').toLowerCase().indexOf(q) !== -1 || stripHtml(p.content||'').toLowerCase().indexOf(q) !== -1 || (p.keywords||[]).join(' ').toLowerCase().indexOf(q)!==-1; }); document.getElementById('blog-list-wrap').innerHTML = ''; document.getElementById('blog-list-wrap').appendChild(renderBlogList(filtered)); });

    return s;
  }

  function applyFilter(keyword) {
    var q = keyword.toLowerCase(); var filtered = (C.blogPosts||[]).filter(function(p){ return (p.keywords||[]).map(function(k){return k.toLowerCase();}).indexOf(q) !== -1; }); document.getElementById('blog-list-wrap').innerHTML = ''; document.getElementById('blog-list-wrap').appendChild(renderBlogList(filtered));
  }

  function renderCreateBlogForm() {
    var wrap = el('div', 'card');
    wrap.appendChild(el('h3', null, 'Create a blog (download .md)'));
    var form = document.createElement('form');
    var title = el('div', null, '<label>Title</label>'); var titleIn = document.createElement('input'); titleIn.type='text'; titleIn.name='title'; titleIn.style.width='100%'; title.appendChild(titleIn); form.appendChild(title);
    var keywords = el('div', null, '<label>Suggested keywords (comma separated)</label>'); var kwIn = document.createElement('input'); kwIn.type='text'; kwIn.name='keywords'; kwIn.style.width='100%'; keywords.appendChild(kwIn); form.appendChild(keywords);
    var content = el('div', null, '<label>Content (HTML or markdown)</label>'); var contIn = document.createElement('textarea'); contIn.name='content'; contIn.rows=10; contIn.style.width='100%'; content.appendChild(contIn); form.appendChild(content);
    var btn = el('button', 'btn btn-primary', 'Download Post'); btn.type='button'; btn.addEventListener('click', function(){ var t=titleIn.value||'untitled'; var kws=kwIn.value||''; var body = contIn.value||''; var md = '---\ntitle: "'+t.replace(/"/g,'\"')+'"\nauthor: "'+(C.brand&&C.brand.author||'')+'"\ndate: "'+(new Date().toISOString())+'"\nkeywords: ['+ (kws.split(',').map(function(x){return '"'+x.trim()+'"'}).join(', ')) +']\n---\n\n'+body; var blob = new Blob([md], {type:'text/markdown'}); var url = URL.createObjectURL(blob); var a = document.createElement('a'); a.href = url; a.download = (t.toLowerCase().replace(/[^a-z0-9]+/g,'-')||'post') + '.md'; document.body.appendChild(a); a.click(); a.remove(); URL.revokeObjectURL(url); });
    form.appendChild(btn);
    wrap.appendChild(form);
    return wrap;
  }

  /* ---- boot (async) ----------------------------------------------------- */
  async function boot() {
    if (!window.SITE_CONFIG) {
      document.getElementById("app").innerHTML =
        '<p style="padding:40px;text-align:center">Could not load config.js</p>';
      return;
    }
    // load blog posts (if present)
    try {
      var resp = await fetch('/blogs/posts.json');
      if (resp.ok) { C.blogPosts = await resp.json(); }
      else { C.blogPosts = C.blogPosts || []; }
    } catch (e) { C.blogPosts = C.blogPosts || []; }

    renderBrandAndNav();
    // initialize auth (Google Sign-In) if configured
    if (typeof initAuth === "function") initAuth();
    var app = document.getElementById("app");

    // If hash points to a blog post, render that first
    var hash = location.hash || '';
    if (hash.indexOf('#blog/') === 0) {
      var slug = decodeURIComponent(hash.replace('#blog/',''));
      app.appendChild(renderBlogPost(slug));
      renderFooter();
      return;
    }

    [
      renderHero(), renderTrustedBy(), renderMentorship(), renderCorporate(),
      renderWhy(), renderCourses(), renderMetrics(), renderTestimonials(),
      renderClients(), renderFaq(), renderBlogSection(), renderFinalCta()
    ].forEach(function (node) { if (node) app.appendChild(node); });
    renderFooter();

    // watch for hash changes to show individual posts
    window.addEventListener('hashchange', function(){
      if (location.hash.indexOf('#blog/') === 0) { location.reload(); }
    });
  }

  if (document.readyState === "loading") {
    document.addEventListener("DOMContentLoaded", boot);
  } else {
    boot();
  }
})();
