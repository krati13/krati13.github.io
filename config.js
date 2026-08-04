/* =============================================================================
   HelloNexa — Website Content Configuration
   -----------------------------------------------------------------------------
   This is the ONLY file you need to edit to change the website text.
   Every heading, paragraph, button label, list item, stat, testimonial and
   FAQ shown on the site is read from the object below.

   HOW TO EDIT (quick version):
     • Text lives inside quotes:  "like this"
     • Keep the quotes and commas exactly as they are.
     • Lists are wrapped in [ square brackets ], one item per line.
     • Save the file and refresh the page to see your changes.

   See README.md for the full guide.
   ========================================================================== */

window.SITE_CONFIG = {
  /* ---- Brand / basic info ------------------------------------------------ */
  brand: {
    name: "HelloNexa",
    tagline: "Tech Career Mentorship & Corporate Training",
    author: "Krati Mittal",
    // Email and links used by the "Book a Session" / "Contact" buttons.
    email: "krati.mittal36@gmail.com",
    // Any button whose text matches "mentorship" links here; others link to contact.
    mentorshipLink: "mailto:krati.mittal36@gmail.com?subject=1:1%20Mentorship",
    corporateLink: "mailto:krati.mittal36@gmail.com?subject=Corporate%20Training",
    social: {
      linkedin: "https://www.linkedin.com/in/krati-mittal/",
      topmate: "https://topmate.io/krati_mittal13"
    },
    auth: {
      google_client_id: "394030770613-epbq4i5opi4ne96jpr2pvaclcbk3mb9r.apps.googleusercontent.com"
    }
  },

  /* ---- Top navigation (labels only; they scroll to page sections) -------- */
  nav: [
    { label: "Home", target: "hero" },
    { label: "Personal Mentorship", target: "mentorship" },
    { label: "Corporate Training", target: "corporate" },
    { label: "Courses", target: "courses" },
    { label: "Blog", target: "blog" },
    { label: "About", target: "why" },
    { label: "Success Stories", target: "testimonials" },
    { label: "FAQ", target: "faq" },
    { label: "Contact", target: "contact" }
  ],

  /* ---- Hero section ------------------------------------------------------ */
  hero: {
    headline: "Accelerate Your Tech Career with Expert Mentorship & Corporate Training",
    subheading:
      "Whether you're preparing for interviews at top product companies or looking to upskill your engineering teams, we deliver structured learning, personalized mentorship, and industry-focused training designed by experienced software engineers.",
    primaryButton: "Book 1:1 Mentorship",
    secondaryButton: "Request Corporate Training"
  },

  /* ---- Trusted By strip (set show:false to hide it) ---------------------- */
  trustedBy: {
    show: true,
    text: "Helping engineers prepare for opportunities at leading technology companies.",
    companies: [
      "Microsoft", "Amazon", "Salesforce", "Adobe", "Walmart",
      "ServiceNow", "Atlassian", "Oracle", "Flipkart"
    ]
  },

  /* ---- Personal Mentorship section -------------------------------------- */
  mentorship: {
    eyebrow: "Personal Mentorship",
    title: "Land Your Dream Software Engineering Role",
    description:
      "We provide personalized guidance to help software engineers confidently crack interviews at top product companies.",
    learnTitle: "What You'll Learn",
    learn: [
      "Data Structures & Algorithms",
      "Low Level Design",
      "High Level System Design",
      "Java Backend Development",
      "Spring Boot & Microservices",
      "Distributed Systems",
      "Machine Coding",
      "AI Backend Engineering",
      "Resume Review",
      "Mock Interviews",
      "Salary Negotiation",
      "Career Planning"
    ],
    includedTitle: "What's Included",
    included: [
      "Personalized Learning Roadmap",
      "Weekly 1:1 Mentorship Sessions",
      "Mock Interviews",
      "Resume Review",
      "Assignment Reviews",
      "Interview Preparation Strategy",
      "Company-specific Guidance"
    ]
  },

  /* ---- Corporate Training section --------------------------------------- */
  corporate: {
    eyebrow: "Corporate Training",
    title: "Upskill Engineering Teams with Industry-Focused Training",
    description:
      "We help organizations strengthen engineering capabilities through practical, hands-on technical training delivered by experienced software professionals.",
    programsTitle: "Training Programs",
    programs: [
      "Java", "Spring Boot", "Microservices", "System Design",
      "Distributed Systems", "Cloud Native Development", "Docker & Kubernetes",
      "Kafka", "API Design", "Performance Optimization",
      "AI for Software Engineers", "Secure Coding", "Backend Architecture",
      "Engineering Best Practices"
    ],
    formatsTitle: "Delivery Formats",
    formats: [
      "Virtual Training", "Classroom Training", "Hybrid Sessions",
      "Workshops", "Bootcamps", "Leadership Sessions", "Custom Learning Programs"
    ]
  },

  /* ---- Why Choose Us section -------------------------------------------- */
  why: {
    eyebrow: "Why Choose Us",
    title: "Learn from Engineers Who Build Real Systems",
    description:
      "Unlike traditional training institutes, our programs are built around solving real engineering problems.",
    approachTitle: "Our Approach",
    approach: [
      "Industry-aligned curriculum",
      "Practical coding sessions",
      "Hands-on projects",
      "Real-world case studies",
      "Personalized mentorship",
      "Small batch sizes",
      "Live Q&A",
      "Continuous feedback",
      "Interview-focused preparation"
    ]
  },

  /* ---- Courses section --------------------------------------------------- */
  courses: {
    eyebrow: "Courses",
    title: "Structured Programs Built for Real Growth",
    items: [
      {
        name: "Java Backend Mastery",
        description:
          "Master modern backend development using Java, Spring Boot, Microservices, Docker, Kubernetes, Kafka, Redis, and Cloud.",
        topics: []
      },
      {
        name: "System Design",
        description:
          "Learn to design scalable systems used by companies like Amazon, Uber, Netflix, and Google.",
        topics: [
          "Caching", "Load Balancing", "Sharding", "Messaging Systems",
          "Event Driven Architecture", "Databases", "CAP Theorem",
          "Distributed Systems"
        ]
      },
      {
        name: "AI Backend Engineering",
        description: "Build AI-powered applications using:",
        topics: [
          "LLM APIs", "RAG", "Vector Databases", "AI Agents",
          "MCP", "Prompt Engineering", "AI System Design"
        ]
      },
      {
        name: "DSA Interview Preparation",
        description: "Structured roadmap covering:",
        topics: [
          "Arrays", "Trees", "Graphs", "Dynamic Programming",
          "Backtracking", "Sliding Window", "Binary Search", "Greedy",
          "Company-wise Interview Questions"
        ]
      }
    ]
  },

  /* ---- Success Metrics section ------------------------------------------ */
  metrics: {
    show: true,
    items: [
      { value: "500+", label: "Engineers Mentored" },
      { value: "100+", label: "Mock Interviews Conducted" },
      { value: "40+", label: "Corporate Workshops" },
      { value: "15+", label: "Years of Industry Experience" }
    ]
  },

  /* ---- Testimonials section --------------------------------------------- */
  testimonials: {
    eyebrow: "Testimonials",
    title: "What People Say",
    items: [
      {
        quote:
          "The mentorship completely transformed my interview preparation. I received an offer from a top product company after just three months.",
        author: "Mentee, Software Engineer"
      },
      {
        quote:
          "Our engineering team gained practical knowledge that immediately improved code quality and system design discussions.",
        author: "Engineering Leader"
      }
    ]
  },

  /* ---- Who We Work With section ----------------------------------------- */
  clients: {
    eyebrow: "Who We Work With",
    title: "Built for Individuals and Organizations",
    groups: [
      {
        name: "Individual Engineers",
        items: [
          "Freshers", "Working Professionals", "Senior Engineers",
          "Tech Leads", "Engineering Managers"
        ]
      },
      {
        name: "Organizations",
        items: [
          "Startups", "Product Companies", "IT Services",
          "Engineering Teams", "Universities", "Corporate L&D Teams"
        ]
      }
    ]
  },

  /* ---- FAQ section ------------------------------------------------------- */
  faq: {
    eyebrow: "FAQ",
    title: "Frequently Asked Questions",
    items: [
      {
        q: "Who are these mentorship programs for?",
        a: "Anyone preparing for software engineering interviews, career transitions, or technical leadership roles."
      },
      {
        q: "Are sessions live?",
        a: "Yes. All mentorship and corporate training sessions are delivered live and are highly interactive."
      },
      {
        q: "Can corporate training be customized?",
        a: "Absolutely. We tailor training content based on your team's technology stack, experience level, and business goals."
      },
      {
        q: "Do you provide mock interviews?",
        a: "Yes. We conduct realistic technical and system design mock interviews with detailed feedback."
      }
    ]
  },

  /* ---- Final Call-to-Action --------------------------------------------- */
  finalCta: {
      title: "Get in Touch",
    description:
        "Let's build your career or upskill your team. Our team typically responds within 24 hours.",
      primaryButton: "Get in Touch",
      secondaryButton: "Book a Mentorship Session"
  },

    /* ---- Contact (renders a form + info) ---------------------------------- */
    contact: {
      email: "krati.mittal36@gmail.com",
      phone: "+91 7042955025",
      location: "Hyderabad, India",
      hours: "Mon–Sat 9:00 AM – 7:00 PM IST",
      formFields: [
        "Full Name",
        "Email Address",
        "Phone Number",
        "Company (Optional)",
        "I am interested in",
        "Message"
      ],
      interests: [
        "1:1 Career Mentorship",
        "Resume Review",
        "Mock Interview",
        "DSA Preparation",
        "System Design",
        "Java Backend",
        "AI Backend Engineering",
        "Corporate Training",
        "University Training",
        "Other"
      ],
      bookButton: "Book a Mentorship Session",
      corporateButton: "Request Corporate Training"
    },


  /* ---- Footer ------------------------------------------------------------ */
  footer: {
    contactTitle: "Contact",
    contactText: "Email: krati.mittal36@gmail.com | Phone: +91 7042955025",
    copyright: "HelloNexa. All rights reserved."
  }
};
