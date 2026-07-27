# HelloNexa Website

A fast, responsive, single-page marketing website for **HelloNexa** — tech career
mentorship & corporate training — hosted on **GitHub Pages**.

**Live site:** https://kratimittal.github.io/

All page text is driven by a single configuration file, so you can update the
website **without touching any HTML or CSS**.

---

## 📁 Project structure

| File | What it is | Do you edit it? |
|------|------------|-----------------|
| **`config.js`** | All website content (text, lists, buttons, FAQ, etc.) | ✅ **Yes — this is the file you edit** |
| `index.html` | Page shell / skeleton | Rarely |
| `script.js` | Builds the page from `config.js` | No |
| `styles.css` | Colors, fonts, layout | Only for design changes |

---

## ✏️ How to edit the website content

Everything you see on the site comes from **`config.js`**. Open it in any text
editor (or directly on GitHub using the ✏️ pencil icon) and change the text
inside the quotes.

### The 3 rules

1. **Only change the text inside quotes.**
   ```js
   headline: "Accelerate Your Tech Career with Expert Mentorship & Corporate Training",
   ```
   Change it to:
   ```js
   headline: "Your New Headline Goes Here",
   ```

2. **Keep the quotes `" "`, the commas `,` and the brackets `[ ] { }`.**
   These are the structure — deleting them breaks the page.

3. **Lists** are items between `[` and `]`, each in quotes and separated by commas:
   ```js
   companies: [
     "Microsoft", "Amazon", "Salesforce", "Adobe"
   ],
   ```
   Add, remove, or reorder items freely — just keep each item quoted and
   comma-separated (no comma after the **last** item).

After saving, **refresh the browser** to see your changes.

### Common edits

| I want to… | Edit this in `config.js` |
|------------|--------------------------|
| Change the site name | `brand.name` |
| Change where the buttons/emails go | `brand.email`, `brand.mentorshipLink`, `brand.corporateLink` |
| Edit the big hero headline / subtext | `hero.headline`, `hero.subheading` |
| Change button labels | `hero.primaryButton`, `hero.secondaryButton`, `finalCta.*` |
| Add/remove "Trusted By" companies | `trustedBy.companies` |
| Hide the "Trusted By" strip | set `trustedBy.show: false` |
| Edit mentorship topics | `mentorship.learn`, `mentorship.included` |
| Edit corporate training programs | `corporate.programs`, `corporate.formats` |
| Edit the courses | `courses.items` (each has `name`, `description`, `topics`) |
| Change the stat numbers | `metrics.items` |
| Edit testimonials | `testimonials.items` |
| Edit FAQ questions/answers | `faq.items` |
| Edit the navigation menu | `nav` (each has a `label` and a `target` section id) |
| Update social links | `brand.social` |

### Special characters

Write text normally — `&`, `<`, quotes, etc. are handled automatically and shown
safely on the page. Example: `"Docker & Kubernetes"` displays as **Docker & Kubernetes**.

### Tip: don't break the file

`config.js` must stay valid JavaScript. If the site goes blank after an edit,
you most likely deleted a quote, comma, or bracket. Undo your last change and
try again — just re-check your quotes and commas.

---

## 🎨 Changing colors & fonts (optional)

Open `styles.css` and edit the variables at the very top:

```css
:root {
  --brand:      #4f46e5;   /* main accent color */
  --brand-dark: #3730a3;
  --ink:        #0f172a;   /* main text color */
  ...
}
```

---

## 🚀 Deploying (GitHub Pages)

This repository is named `kratimittal.github.io`, so GitHub Pages serves it
automatically from the `main` branch root.

1. Commit and push your changes to the `main` branch.
2. GitHub Pages rebuilds within ~1 minute.
3. Visit **https://kratimittal.github.io/**.

To enable Pages the first time: **Settings → Pages → Source: Deploy from a branch
→ Branch: `main` / root**.

---

## 🖥️ Previewing locally

No build step is required. Either open `index.html` directly in a browser, or run
a simple local server from the project folder:

```bash
# Python 3
python -m http.server 8000
```

Then open <http://localhost:8000>.

---

## Sections on the page

Home (Hero) · Trusted By · Personal Mentorship · Corporate Training ·
Why Choose Us / About · Courses · Success Metrics · Testimonials ·
Who We Work With · FAQ · Contact / Final CTA
