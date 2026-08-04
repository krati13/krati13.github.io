---
title: "Caching Strategies for High Traffic Systems"
author: "Krati Mittal"
date: "2025-08-20"
original_url: "https://getsdeready.com/caching-strategies/"
keywords:
- caching
- performance
- system design
---

<div id="content" class="site-content">
		<div data-elementor-type="wp-post" data-elementor-id="45941" class="elementor elementor-45941" data-elementor-post-type="post">
				<div class="elementor-element elementor-element-ef65104 e-con-full e-flex e-con e-parent" data-id="ef65104" data-element_type="container" data-e-type="container">
		<div class="elementor-element elementor-element-647d78e e-con-full elementor-hidden-mobile e-flex e-con e-child" data-id="647d78e" data-element_type="container" data-e-type="container" data-settings="{&quot;background_background&quot;:&quot;classic&quot;}">
				<div class="elementor-element elementor-element-18da701 elementor-widget elementor-widget-template" data-id="18da701" data-element_type="widget" data-e-type="widget" data-settings="{&quot;sticky&quot;:&quot;top&quot;,&quot;sticky_parent&quot;:&quot;yes&quot;,&quot;sticky_on&quot;:[&quot;desktop&quot;,&quot;tablet&quot;,&quot;mobile&quot;],&quot;sticky_offset&quot;:0,&quot;sticky_effects_offset&quot;:0,&quot;sticky_anchor_link_offset&quot;:0}" data-widget_type="template.default">
				<div class="elementor-widget-container">
							<div class="elementor-template">
					<div data-elementor-type="section" data-elementor-id="34765" class="elementor elementor-34765" data-elementor-post-type="elementor_library">
			<div class="elementor-element elementor-element-e77cca3 e-flex e-con-boxed e-con e-parent" data-id="e77cca3" data-element_type="container" data-e-type="container">
					<div class="e-con-inner">
				<div class="elementor-element elementor-element-0282c69 vertical-menu elementor-widget elementor-widget-n-accordion" data-id="0282c69" data-element_type="widget" data-e-type="widget" data-settings="{&quot;sticky&quot;:&quot;top&quot;,&quot;sticky_offset&quot;:20,&quot;sticky_parent&quot;:&quot;yes&quot;,&quot;default_state&quot;:&quot;expanded&quot;,&quot;max_items_expended&quot;:&quot;one&quot;,&quot;n_accordion_animation_duration&quot;:{&quot;unit&quot;:&quot;ms&quot;,&quot;size&quot;:400,&quot;sizes&quot;:[]},&quot;sticky_on&quot;:[&quot;desktop&quot;,&quot;tablet&quot;,&quot;mobile&quot;],&quot;sticky_effects_offset&quot;:0,&quot;sticky_anchor_link_offset&quot;:0}" data-widget_type="nested-accordion.default">
				<div class="elementor-widget-container">
							<div class="e-n-accordion" aria-label="Accordion. Open links with Enter or Space, close with Escape, and navigate with Arrow Keys">
						<details id="e-n-accordion-item-2630" class="e-n-accordion-item" open>
				<summary class="e-n-accordion-item-title" data-accordion-index="1" tabindex="0" aria-expanded="true" aria-controls="e-n-accordion-item-2630" >
					<span class='e-n-accordion-item-title-header'><div class="e-n-accordion-item-title-text">  Data Structures and Algorithms </div></span>
							<span class='e-n-accordion-item-title-icon'>
			<span class='e-opened' ><svg aria-hidden="true" class="e-font-icon-svg e-fas-minus" viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M416 208H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h384c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z"></path></svg></span>
			<span class='e-closed'><svg aria-hidden="true" class="e-font-icon-svg e-fas-plus" viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M416 208H272V64c0-17.67-14.33-32-32-32h-32c-17.67 0-32 14.33-32 32v144H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h144v144c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32V304h144c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z"></path></svg></span>
		</span>

						</summary>
				<div role="region" aria-labelledby="e-n-accordion-item-2630" class="elementor-element elementor-element-dbd536e e-con-full e-flex e-con e-child" data-id="dbd536e" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-49604d2 elementor-icon-list--layout-traditional elementor-list-item-link-full_width elementor-widget elementor-widget-icon-list" data-id="49604d2" data-element_type="widget" data-e-type="widget" data-widget_type="icon-list.default">
				<div class="elementor-widget-container">
							<ul class="elementor-icon-list-items">
							<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/introduction-to-data-structures-and-algorithms/">

											<span class="elementor-icon-list-text">Introduction to Data Structures and Algorithms</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/time-and-space-complexity-analysis/">

											<span class="elementor-icon-list-text">Time and Space Complexity Analysis</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/big-o-big-theta-big-omega-notations-explained/">

											<span class="elementor-icon-list-text">Big-O, Big-Theta, and Big-Omega Notations</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/recursion-backtracking-guide-basics-apps-tips/">

											<span class="elementor-icon-list-text">Recursion and Backtracking</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/divide-and-conquer-algorithm/">

											<span class="elementor-icon-list-text">Divide and Conquer Algorithm</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/dynamic-programming-memoization-vs-tabulation-explained/">

											<span class="elementor-icon-list-text">Dynamic Programming: Memoization vs. Tabulation</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
										<span class="elementor-icon-list-text">Greedy Algorithms and Their Use Cases</span>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/understanding-arrays-types-operations-applications/">

											<span class="elementor-icon-list-text">Understanding Arrays: Types and Operations</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/searching-algorithms-linear-vs-binary-search-explained/">

											<span class="elementor-icon-list-text">Linear Search vs. Binary Search</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/sorting-algorithms-explained/">

											<span class="elementor-icon-list-text">Sorting Algorithms: Bubble, Insertion, Selection, and Merge Sort</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/quicksort-algorithm/">

											<span class="elementor-icon-list-text">QuickSort: Explanation and Implementation</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
										<span class="elementor-icon-list-text">Heap Sort and Its Applications</span>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/counting-radix-bucket-sort-in-depth-algorithms-guide/">

											<span class="elementor-icon-list-text">Counting Sort, Radix Sort, and Bucket Sort</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/master-hashing-hash-tables-collisions-explained/">

											<span class="elementor-icon-list-text">Hashing Techniques: Hash Tables and Collisions</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/open-addressing-vs-separate-chaining/">

											<span class="elementor-icon-list-text">Open Addressing vs. Separate Chaining in Hashing</span>
											</a>
									</li>
						</ul>
						</div>
				</div>
				<div class="elementor-element elementor-element-52cad68 elementor-icon-list--layout-traditional elementor-list-item-link-full_width elementor-widget elementor-widget-icon-list" data-id="52cad68" data-element_type="widget" data-e-type="widget" data-widget_type="icon-list.default">
				<div class="elementor-widget-container">
							<ul class="elementor-icon-list-items">
							<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/dsa-web-dev-courses-enhance-your-tech-skills/">

											<span class="elementor-icon-list-text">DSA Questions for Beginners</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/advanced-dsa-questions-competitive-programming-guide/">

											<span class="elementor-icon-list-text">Advanced DSA Questions for Competitive Programming</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-10-dsa-questions-for-coding-tests/">

											<span class="elementor-icon-list-text">Top 10 DSA Questions to Crack Your Next Coding Test</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/essential-dsa-web-dev-courses-for-programmers/">

											<span class="elementor-icon-list-text">Top 50 DSA Questions Every Programmer Should Practice</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-atlassian-dsa-interview-questions-solutions-2025-guide/">

											<span class="elementor-icon-list-text">Top Atlassian DSA Interview Questions</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-amazon-dsa-interview-questions-prep-guide-2025/">

											<span class="elementor-icon-list-text">Top Amazon DSA Interview Questions</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-20-microsoft-dsa-interview-questions-expert-tips-2025-guide/">

											<span class="elementor-icon-list-text">Top Microsoft DSA Interview Questions </span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-meta-facebook-dsa-interview-questions-how-to-prepare-in-2024/">

											<span class="elementor-icon-list-text">Top Meta (Facebook) DSA Interview Questions</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-netflix-dsa-interview-questions-2025-prep-guide/">

											<span class="elementor-icon-list-text">Netflix DSA Interview Questions and Preparation Guide</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-20-dsa-interview-questions-you-need-to-know/">

											<span class="elementor-icon-list-text">Top 20 DSA Interview Questions You Need to Know</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-uber-dsa-interview-questions-and-solutions-2025/">

											<span class="elementor-icon-list-text">Top Uber DSA Interview Questions and Solutions</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/google-dsa-interview-prep-top-questions-strategies/">

											<span class="elementor-icon-list-text">Google DSA Interview Questions and How to Prepare</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-airbnb-dsa-interview-questions/">

											<span class="elementor-icon-list-text">Airbnb DSA Interview Questions and How to Solve Them</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/mobile-app-dsa-interview-questions/">

											<span class="elementor-icon-list-text">Mobile App DSA Interview Questions and Solutions</span>
											</a>
									</li>
						</ul>
						</div>
				</div>
				</div>
					</details>
						<details id="e-n-accordion-item-2631" class="e-n-accordion-item" >
				<summary class="e-n-accordion-item-title" data-accordion-index="2" tabindex="-1" aria-expanded="false" aria-controls="e-n-accordion-item-2631" >
					<span class='e-n-accordion-item-title-header'><div class="e-n-accordion-item-title-text"> DSA Interview Questions  </div></span>
							<span class='e-n-accordion-item-title-icon'>
			<span class='e-opened' ><svg aria-hidden="true" class="e-font-icon-svg e-fas-minus" viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M416 208H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h384c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z"></path></svg></span>
			<span class='e-closed'><svg aria-hidden="true" class="e-font-icon-svg e-fas-plus" viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M416 208H272V64c0-17.67-14.33-32-32-32h-32c-17.67 0-32 14.33-32 32v144H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h144v144c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32V304h144c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z"></path></svg></span>
		</span>

						</summary>
				<div role="region" aria-labelledby="e-n-accordion-item-2631" class="elementor-element elementor-element-43412a8 e-con-full e-flex e-con e-child" data-id="43412a8" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-b082220 elementor-icon-list--layout-traditional elementor-list-item-link-full_width elementor-widget elementor-widget-icon-list" data-id="b082220" data-element_type="widget" data-e-type="widget" data-widget_type="icon-list.default">
				<div class="elementor-widget-container">
							<ul class="elementor-icon-list-items">
							<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/dsa-web-dev-courses-enhance-your-tech-skills/">

											<span class="elementor-icon-list-text">DSA Questions for Beginners</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/advanced-dsa-questions-competitive-programming-guide/">

											<span class="elementor-icon-list-text">Advanced DSA Questions for Competitive Programming</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-10-dsa-questions-for-coding-tests/">

											<span class="elementor-icon-list-text">Top 10 DSA Questions to Crack Your Next Coding Test</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/essential-dsa-web-dev-courses-for-programmers/">

											<span class="elementor-icon-list-text">Top 50 DSA Questions Every Programmer Should Practice</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-atlassian-dsa-interview-questions-solutions-2025-guide/">

											<span class="elementor-icon-list-text">Top Atlassian DSA Interview Questions</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-amazon-dsa-interview-questions-prep-guide-2025/">

											<span class="elementor-icon-list-text">Top Amazon DSA Interview Questions</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-20-microsoft-dsa-interview-questions-expert-tips-2025-guide/">

											<span class="elementor-icon-list-text">Top Microsoft DSA Interview Questions </span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-meta-facebook-dsa-interview-questions-how-to-prepare-in-2024/">

											<span class="elementor-icon-list-text">Top Meta (Facebook) DSA Interview Questions</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-netflix-dsa-interview-questions-2025-prep-guide/">

											<span class="elementor-icon-list-text">Netflix DSA Interview Questions and Preparation Guide</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-20-dsa-interview-questions-you-need-to-know/">

											<span class="elementor-icon-list-text">Top 20 DSA Interview Questions You Need to Know</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-uber-dsa-interview-questions-and-solutions-2025/">

											<span class="elementor-icon-list-text">Top Uber DSA Interview Questions and Solutions</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/google-dsa-interview-prep-top-questions-strategies/">

											<span class="elementor-icon-list-text">Google DSA Interview Questions and How to Prepare</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-airbnb-dsa-interview-questions/">

											<span class="elementor-icon-list-text">Airbnb DSA Interview Questions and How to Solve Them</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/mobile-app-dsa-interview-questions/">

											<span class="elementor-icon-list-text">Mobile App DSA Interview Questions and Solutions</span>
											</a>
									</li>
						</ul>
						</div>
				</div>
				</div>
					</details>
					</div>
						</div>
				</div>
					</div>
				</div>
				</div>
				</div>
						</div>
				</div>
				</div>
		<div class="elementor-element elementor-element-6d0333c e-con-full e-flex e-con e-child" data-id="6d0333c" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-afb2535 elementor-hidden-desktop elementor-hidden-tablet elementor-widget elementor-widget-button" data-id="afb2535" data-element_type="widget" data-e-type="widget" data-settings="{&quot;sticky&quot;:&quot;top&quot;,&quot;sticky_offset&quot;:20,&quot;sticky_on&quot;:[&quot;desktop&quot;,&quot;tablet&quot;,&quot;mobile&quot;],&quot;sticky_effects_offset&quot;:0,&quot;sticky_anchor_link_offset&quot;:0}" data-widget_type="button.default">
				<div class="elementor-widget-container">
									<div class="elementor-button-wrapper">
					<a class="elementor-button elementor-button-link elementor-size-sm" href="#elementor-action%3Aaction%3Doff_canvas%3Aopen%26settings%3DeyJpZCI6ImQ2MDlkZDkiLCJkaXNwbGF5TW9kZSI6Im9wZW4ifQ%3D%3D">
						<span class="elementor-button-content-wrapper">
						<span class="elementor-button-icon">
				<svg aria-hidden="true" class="e-font-icon-svg e-fas-long-arrow-alt-right" viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M313.941 216H12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h301.941v46.059c0 21.382 25.851 32.09 40.971 16.971l86.059-86.059c9.373-9.373 9.373-24.569 0-33.941l-86.059-86.059c-15.119-15.119-40.971-4.411-40.971 16.971V216z"></path></svg>			</span>
									<span class="elementor-button-text">Menu </span>
					</span>
					</a>
				</div>
								</div>
				</div>
				<div class="elementor-element elementor-element-d609dd9 elementor-widget elementor-widget-off-canvas" data-id="d609dd9" data-element_type="widget" data-e-type="widget" data-settings="{&quot;entrance_animation&quot;:&quot;slideInLeft&quot;,&quot;exit_animation&quot;:&quot;slideInLeft&quot;,&quot;prevent_scroll&quot;:&quot;yes&quot;}" data-widget_type="off-canvas.default">
				<div class="elementor-widget-container">
							<div id="off-canvas-d609dd9" class="e-off-canvas" role="dialog" aria-hidden="true" aria-label="Off-Canvas" aria-modal="true" inert="" data-delay-child-handlers="true">
			<div class="e-off-canvas__overlay"></div>
			<div class="e-off-canvas__main">
				<div class="e-off-canvas__content">
					<div class="elementor-element elementor-element-2113a9e e-con-full e-flex e-con e-child" data-id="2113a9e" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-f57a691 elementor-absolute elementor-view-default elementor-widget elementor-widget-icon" data-id="f57a691" data-element_type="widget" data-e-type="widget" data-settings="{&quot;_position&quot;:&quot;absolute&quot;}" data-widget_type="icon.default">
				<div class="elementor-widget-container">
							<div class="elementor-icon-wrapper">
			<a class="elementor-icon" href="#elementor-action%3Aaction%3Doff_canvas%3Aclose%26settings%3DeyJpZCI6ImQ2MDlkZDkiLCJkaXNwbGF5TW9kZSI6ImNsb3NlIn0%3D">
			<svg xmlns="http://www.w3.org/2000/svg" id="ae55beb6-ee14-4002-91dc-05e70bbad1c5" data-name="Layer 1" viewBox="0 0 28.2843 28.2843"><title>close menu icon</title><polygon points="28.284 1.414 26.87 0 14.142 12.728 1.414 0 0 1.414 12.728 14.142 0 26.87 1.414 28.284 14.142 15.556 26.87 28.284 28.284 26.87 15.556 14.142 28.284 1.414" style="fill-rule:evenodd"></polygon></svg>			</a>
		</div>
						</div>
				</div>
				<div class="elementor-element elementor-element-a17d286 elementor-widget elementor-widget-template" data-id="a17d286" data-element_type="widget" data-e-type="widget" data-widget_type="template.default">
				<div class="elementor-widget-container">
							<div class="elementor-template">
					<div data-elementor-type="section" data-elementor-id="34765" class="elementor elementor-34765" data-elementor-post-type="elementor_library">
			<div class="elementor-element elementor-element-e77cca3 e-flex e-con-boxed e-con e-parent" data-id="e77cca3" data-element_type="container" data-e-type="container">
					<div class="e-con-inner">
				<div class="elementor-element elementor-element-0282c69 vertical-menu elementor-widget elementor-widget-n-accordion" data-id="0282c69" data-element_type="widget" data-e-type="widget" data-settings="{&quot;sticky&quot;:&quot;top&quot;,&quot;sticky_offset&quot;:20,&quot;sticky_parent&quot;:&quot;yes&quot;,&quot;default_state&quot;:&quot;expanded&quot;,&quot;max_items_expended&quot;:&quot;one&quot;,&quot;n_accordion_animation_duration&quot;:{&quot;unit&quot;:&quot;ms&quot;,&quot;size&quot;:400,&quot;sizes&quot;:[]},&quot;sticky_on&quot;:[&quot;desktop&quot;,&quot;tablet&quot;,&quot;mobile&quot;],&quot;sticky_effects_offset&quot;:0,&quot;sticky_anchor_link_offset&quot;:0}" data-widget_type="nested-accordion.default">
				<div class="elementor-widget-container">
							<div class="e-n-accordion" aria-label="Accordion. Open links with Enter or Space, close with Escape, and navigate with Arrow Keys">
						<details id="e-n-accordion-item-2630" class="e-n-accordion-item" open>
				<summary class="e-n-accordion-item-title" data-accordion-index="1" tabindex="0" aria-expanded="true" aria-controls="e-n-accordion-item-2630" >
					<span class='e-n-accordion-item-title-header'><div class="e-n-accordion-item-title-text">  Data Structures and Algorithms </div></span>
							<span class='e-n-accordion-item-title-icon'>
			<span class='e-opened' ><svg aria-hidden="true" class="e-font-icon-svg e-fas-minus" viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M416 208H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h384c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z"></path></svg></span>
			<span class='e-closed'><svg aria-hidden="true" class="e-font-icon-svg e-fas-plus" viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M416 208H272V64c0-17.67-14.33-32-32-32h-32c-17.67 0-32 14.33-32 32v144H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h144v144c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32V304h144c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z"></path></svg></span>
		</span>

						</summary>
				<div role="region" aria-labelledby="e-n-accordion-item-2630" class="elementor-element elementor-element-dbd536e e-con-full e-flex e-con e-child" data-id="dbd536e" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-49604d2 elementor-icon-list--layout-traditional elementor-list-item-link-full_width elementor-widget elementor-widget-icon-list" data-id="49604d2" data-element_type="widget" data-e-type="widget" data-widget_type="icon-list.default">
				<div class="elementor-widget-container">
							<ul class="elementor-icon-list-items">
							<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/introduction-to-data-structures-and-algorithms/">

											<span class="elementor-icon-list-text">Introduction to Data Structures and Algorithms</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/time-and-space-complexity-analysis/">

											<span class="elementor-icon-list-text">Time and Space Complexity Analysis</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/big-o-big-theta-big-omega-notations-explained/">

											<span class="elementor-icon-list-text">Big-O, Big-Theta, and Big-Omega Notations</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/recursion-backtracking-guide-basics-apps-tips/">

											<span class="elementor-icon-list-text">Recursion and Backtracking</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/divide-and-conquer-algorithm/">

											<span class="elementor-icon-list-text">Divide and Conquer Algorithm</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/dynamic-programming-memoization-vs-tabulation-explained/">

											<span class="elementor-icon-list-text">Dynamic Programming: Memoization vs. Tabulation</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
										<span class="elementor-icon-list-text">Greedy Algorithms and Their Use Cases</span>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/understanding-arrays-types-operations-applications/">

											<span class="elementor-icon-list-text">Understanding Arrays: Types and Operations</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/searching-algorithms-linear-vs-binary-search-explained/">

											<span class="elementor-icon-list-text">Linear Search vs. Binary Search</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/sorting-algorithms-explained/">

											<span class="elementor-icon-list-text">Sorting Algorithms: Bubble, Insertion, Selection, and Merge Sort</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/quicksort-algorithm/">

											<span class="elementor-icon-list-text">QuickSort: Explanation and Implementation</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
										<span class="elementor-icon-list-text">Heap Sort and Its Applications</span>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/counting-radix-bucket-sort-in-depth-algorithms-guide/">

											<span class="elementor-icon-list-text">Counting Sort, Radix Sort, and Bucket Sort</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/master-hashing-hash-tables-collisions-explained/">

											<span class="elementor-icon-list-text">Hashing Techniques: Hash Tables and Collisions</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/open-addressing-vs-separate-chaining/">

											<span class="elementor-icon-list-text">Open Addressing vs. Separate Chaining in Hashing</span>
											</a>
									</li>
						</ul>
						</div>
				</div>
				<div class="elementor-element elementor-element-52cad68 elementor-icon-list--layout-traditional elementor-list-item-link-full_width elementor-widget elementor-widget-icon-list" data-id="52cad68" data-element_type="widget" data-e-type="widget" data-widget_type="icon-list.default">
				<div class="elementor-widget-container">
							<ul class="elementor-icon-list-items">
							<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/dsa-web-dev-courses-enhance-your-tech-skills/">

											<span class="elementor-icon-list-text">DSA Questions for Beginners</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/advanced-dsa-questions-competitive-programming-guide/">

											<span class="elementor-icon-list-text">Advanced DSA Questions for Competitive Programming</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-10-dsa-questions-for-coding-tests/">

											<span class="elementor-icon-list-text">Top 10 DSA Questions to Crack Your Next Coding Test</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/essential-dsa-web-dev-courses-for-programmers/">

											<span class="elementor-icon-list-text">Top 50 DSA Questions Every Programmer Should Practice</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-atlassian-dsa-interview-questions-solutions-2025-guide/">

											<span class="elementor-icon-list-text">Top Atlassian DSA Interview Questions</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-amazon-dsa-interview-questions-prep-guide-2025/">

											<span class="elementor-icon-list-text">Top Amazon DSA Interview Questions</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-20-microsoft-dsa-interview-questions-expert-tips-2025-guide/">

											<span class="elementor-icon-list-text">Top Microsoft DSA Interview Questions </span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-meta-facebook-dsa-interview-questions-how-to-prepare-in-2024/">

											<span class="elementor-icon-list-text">Top Meta (Facebook) DSA Interview Questions</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-netflix-dsa-interview-questions-2025-prep-guide/">

											<span class="elementor-icon-list-text">Netflix DSA Interview Questions and Preparation Guide</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-20-dsa-interview-questions-you-need-to-know/">

											<span class="elementor-icon-list-text">Top 20 DSA Interview Questions You Need to Know</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-uber-dsa-interview-questions-and-solutions-2025/">

											<span class="elementor-icon-list-text">Top Uber DSA Interview Questions and Solutions</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/google-dsa-interview-prep-top-questions-strategies/">

											<span class="elementor-icon-list-text">Google DSA Interview Questions and How to Prepare</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-airbnb-dsa-interview-questions/">

											<span class="elementor-icon-list-text">Airbnb DSA Interview Questions and How to Solve Them</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/mobile-app-dsa-interview-questions/">

											<span class="elementor-icon-list-text">Mobile App DSA Interview Questions and Solutions</span>
											</a>
									</li>
						</ul>
						</div>
				</div>
				</div>
					</details>
						<details id="e-n-accordion-item-2631" class="e-n-accordion-item" >
				<summary class="e-n-accordion-item-title" data-accordion-index="2" tabindex="-1" aria-expanded="false" aria-controls="e-n-accordion-item-2631" >
					<span class='e-n-accordion-item-title-header'><div class="e-n-accordion-item-title-text"> DSA Interview Questions  </div></span>
							<span class='e-n-accordion-item-title-icon'>
			<span class='e-opened' ><svg aria-hidden="true" class="e-font-icon-svg e-fas-minus" viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M416 208H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h384c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z"></path></svg></span>
			<span class='e-closed'><svg aria-hidden="true" class="e-font-icon-svg e-fas-plus" viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M416 208H272V64c0-17.67-14.33-32-32-32h-32c-17.67 0-32 14.33-32 32v144H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h144v144c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32V304h144c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z"></path></svg></span>
		</span>

						</summary>
				<div role="region" aria-labelledby="e-n-accordion-item-2631" class="elementor-element elementor-element-43412a8 e-con-full e-flex e-con e-child" data-id="43412a8" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-b082220 elementor-icon-list--layout-traditional elementor-list-item-link-full_width elementor-widget elementor-widget-icon-list" data-id="b082220" data-element_type="widget" data-e-type="widget" data-widget_type="icon-list.default">
				<div class="elementor-widget-container">
							<ul class="elementor-icon-list-items">
							<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/dsa-web-dev-courses-enhance-your-tech-skills/">

											<span class="elementor-icon-list-text">DSA Questions for Beginners</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/advanced-dsa-questions-competitive-programming-guide/">

											<span class="elementor-icon-list-text">Advanced DSA Questions for Competitive Programming</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-10-dsa-questions-for-coding-tests/">

											<span class="elementor-icon-list-text">Top 10 DSA Questions to Crack Your Next Coding Test</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/essential-dsa-web-dev-courses-for-programmers/">

											<span class="elementor-icon-list-text">Top 50 DSA Questions Every Programmer Should Practice</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-atlassian-dsa-interview-questions-solutions-2025-guide/">

											<span class="elementor-icon-list-text">Top Atlassian DSA Interview Questions</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-amazon-dsa-interview-questions-prep-guide-2025/">

											<span class="elementor-icon-list-text">Top Amazon DSA Interview Questions</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-20-microsoft-dsa-interview-questions-expert-tips-2025-guide/">

											<span class="elementor-icon-list-text">Top Microsoft DSA Interview Questions </span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-meta-facebook-dsa-interview-questions-how-to-prepare-in-2024/">

											<span class="elementor-icon-list-text">Top Meta (Facebook) DSA Interview Questions</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-netflix-dsa-interview-questions-2025-prep-guide/">

											<span class="elementor-icon-list-text">Netflix DSA Interview Questions and Preparation Guide</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-20-dsa-interview-questions-you-need-to-know/">

											<span class="elementor-icon-list-text">Top 20 DSA Interview Questions You Need to Know</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-uber-dsa-interview-questions-and-solutions-2025/">

											<span class="elementor-icon-list-text">Top Uber DSA Interview Questions and Solutions</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/google-dsa-interview-prep-top-questions-strategies/">

											<span class="elementor-icon-list-text">Google DSA Interview Questions and How to Prepare</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/top-airbnb-dsa-interview-questions/">

											<span class="elementor-icon-list-text">Airbnb DSA Interview Questions and How to Solve Them</span>
											</a>
									</li>
								<li class="elementor-icon-list-item">
											<a href="https://getsdeready.com/mobile-app-dsa-interview-questions/">

											<span class="elementor-icon-list-text">Mobile App DSA Interview Questions and Solutions</span>
											</a>
									</li>
						</ul>
						</div>
				</div>
				</div>
					</details>
					</div>
						</div>
				</div>
					</div>
				</div>
				</div>
				</div>
						</div>
				</div>
				</div>
						</div>
			</div>
		</div>
						</div>
				</div>
				<div class="elementor-element elementor-element-757deaa elementor-widget elementor-widget-heading" data-id="757deaa" data-element_type="widget" data-e-type="widget" data-widget_type="heading.default">
				<div class="elementor-widget-container">
					<h1 class="elementor-heading-title elementor-size-default">Caching Strategies Explained with Interview Examples</h1>				</div>
				</div>
				<div class="elementor-element elementor-element-5050081 elementor-widget elementor-widget-post-info" data-id="5050081" data-element_type="widget" data-e-type="widget" data-widget_type="post-info.default">
				<div class="elementor-widget-container">
							<ul class="elementor-inline-items elementor-icon-list-items elementor-post-info">
								<li class="elementor-icon-list-item elementor-repeater-item-dd7c26e elementor-inline-item" itemprop="author">
						<a href="https://getsdeready.com/author/goelarungoelarun/">
											<span class="elementor-icon-list-icon">
								<svg aria-hidden="true" class="e-font-icon-svg e-far-user-circle" viewBox="0 0 496 512" xmlns="http://www.w3.org/2000/svg"><path d="M248 104c-53 0-96 43-96 96s43 96 96 96 96-43 96-96-43-96-96-96zm0 144c-26.5 0-48-21.5-48-48s21.5-48 48-48 48 21.5 48 48-21.5 48-48 48zm0-240C111 8 0 119 0 256s111 248 248 248 248-111 248-248S385 8 248 8zm0 448c-49.7 0-95.1-18.3-130.1-48.4 14.9-23 40.4-38.6 69.6-39.5 20.8 6.4 40.6 9.6 60.5 9.6s39.7-3.1 60.5-9.6c29.2 1 54.7 16.5 69.6 39.5-35 30.1-80.4 48.4-130.1 48.4zm162.7-84.1c-24.4-31.4-62.1-51.9-105.1-51.9-10.2 0-26 9.6-57.6 9.6-31.5 0-47.4-9.6-57.6-9.6-42.9 0-80.6 20.5-105.1 51.9C61.9 339.2 48 299.2 48 256c0-110.3 89.7-200 200-200s200 89.7 200 200c0 43.2-13.9 83.2-37.3 115.9z"></path></svg>							</span>
									<span class="elementor-icon-list-text elementor-post-info__item elementor-post-info__item--type-author">
										Arun Goel					</span>
									</a>
				</li>
				<li class="elementor-icon-list-item elementor-repeater-item-8efcc65 elementor-inline-item" itemprop="datePublished">
						<a href="https://getsdeready.com/2025/10/03/">
											<span class="elementor-icon-list-icon">
								<svg aria-hidden="true" class="e-font-icon-svg e-fas-calendar" viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M12 192h424c6.6 0 12 5.4 12 12v260c0 26.5-21.5 48-48 48H48c-26.5 0-48-21.5-48-48V204c0-6.6 5.4-12 12-12zm436-44v-36c0-26.5-21.5-48-48-48h-48V12c0-6.6-5.4-12-12-12h-40c-6.6 0-12 5.4-12 12v52H160V12c0-6.6-5.4-12-12-12h-40c-6.6 0-12 5.4-12 12v52H48C21.5 64 0 85.5 0 112v36c0 6.6 5.4 12 12 12h424c6.6 0 12-5.4 12-12z"></path></svg>							</span>
									<span class="elementor-icon-list-text elementor-post-info__item elementor-post-info__item--type-date">
										<time>October 3, 2025</time>					</span>
									</a>
				</li>
				</ul>
						</div>
				</div>
				<div class="elementor-element elementor-element-2b8f88d elementor-widget elementor-widget-text-editor" data-id="2b8f88d" data-element_type="widget" data-e-type="widget" data-widget_type="text-editor.default">
				<div class="elementor-widget-container">
									<p>Imagine you&#8217;re building a high-traffic web application where every millisecond counts—users expect lightning-fast responses, and your backend can&#8217;t afford to hit the database for every request. That&#8217;s where caching comes in, a powerhouse technique that stores frequently accessed data for quick retrieval, slashing latency and boosting performance. To get started with hands-on learning and stay ahead in mastering these concepts, <a href="https://forms.gle/PwjMbodEM83QYKAa6" target="_blank" rel="noopener">sign up</a> for our free courses and receive the latest updates on essential tech skills.</p><p>In this comprehensive guide, we&#8217;ll dive deep into caching strategies, exploring their mechanics, real-world applications, and how they can make or break system performance. Whether you&#8217;re a developer optimizing your app or prepping for a technical interview, understanding caching isn&#8217;t just useful—it&#8217;s essential. We&#8217;ll back this up with factual insights, like how effective caching can reduce database costs by up to 70% according to AWS documentation, and include expert perspectives from industry leaders. Let&#8217;s break it down step by step.</p><h2>Understanding the Basics of Caching</h2><p>Caching is fundamentally about storing copies of data in a temporary, high-speed location to avoid redundant computations or database queries. At its core, it leverages the principle of locality—data that&#8217;s accessed once is likely to be accessed again soon.</p><p>Think of caching as a barista remembering your usual coffee order; instead of checking the menu every time, they serve it instantly. In software terms, this means storing results from expensive operations, like API calls or complex calculations, so future requests can pull from the cache instead of recalculating.</p><p>Key benefits include:</p><ul><li style="font-weight: 400;" aria-level="1">Performance Boost: Caching can improve read throughput by orders of magnitude—studies from Redis Labs show systems handling millions of operations per second with proper caching.</li><li style="font-weight: 400;" aria-level="1">Cost Savings: By offloading databases, you reduce query loads; for instance, Netflix reports caching helps manage petabytes of data without proportional infrastructure costs.</li><li style="font-weight: 400;" aria-level="1">Scalability: It handles traffic spikes gracefully, as seen in e-commerce sites during Black Friday sales.</li><li style="font-weight: 400;" aria-level="1">User Experience: Faster load times lead to lower bounce rates—Google research indicates a 100ms delay can drop conversions by 7%.</li></ul><p>However, caching isn&#8217;t a silver bullet. Poor implementation can lead to stale data or increased complexity. As Martin Fowler, a renowned software architect, notes, &#8220;Caching is one of those things that&#8217;s simple in concept but devilishly tricky in practice.&#8221;</p><p>For those diving into related topics like data structures that power caches, our<a href="https://getsdeready.com/courses/dsa/"> DSA course</a> offers practical exercises to build your foundation.</p><h2>Types of Caching Strategies</h2><p>Caching strategies dictate how data is read from and written to the cache. Choosing the right one depends on your workload—read-heavy apps might favor lazy loading, while write-intensive ones need consistency guarantees. Below, we explore the most common strategies, with pros, cons, and examples.</p><h3>Cache-Aside (Lazy Loading)</h3><p>In cache-aside, the application manages the cache directly. On a read, it checks the cache first; if missed, it fetches from the database and populates the cache.</p><ul><li style="font-weight: 400;" aria-level="1">How It Works: Application code handles logic—e.g., in Java with Redis: check if key exists, if not, query DB and set key with TTL.</li><li style="font-weight: 400;" aria-level="1">Pros: Flexible control, only caches requested data (efficient for sparse access).</li><li style="font-weight: 400;" aria-level="1">Cons: Initial cache misses add latency; risk of thundering herd (many simultaneous misses overwhelming the DB).</li><li style="font-weight: 400;" aria-level="1">Use Case: Social media feeds where user-specific data is queried on demand. As per a GeeksforGeeks analysis, this strategy shines in read-heavy scenarios with unpredictable access patterns.</li></ul><h3>Read-Through</h3><p>Here, the cache itself fetches data from the source on a miss, transparent to the application.</p><ul><li style="font-weight: 400;" aria-level="1">How It Works: Cache acts as a proxy—e.g., using libraries like Guava in Java, where a loader function pulls from DB.</li><li style="font-weight: 400;" aria-level="1">Pros: Simplifies app code; ensures consistency as cache handles loading.</li><li style="font-weight: 400;" aria-level="1">Cons: Tighter coupling; first-time misses still hit the source.</li><li style="font-weight: 400;" aria-level="1">Use Case: Database query results in ORM tools like Hibernate&#8217;s second-level cache. Expert quote from AWS docs: &#8220;Read-through is ideal for reactive loading in high-availability systems.&#8221;</li></ul>								</div>
				</div>
				<div class="elementor-element elementor-element-6fd7153 elementor-widget elementor-widget-image" data-id="6fd7153" data-element_type="widget" data-e-type="widget" data-widget_type="image.default">
				<div class="elementor-widget-container">
															<img fetchpriority="high" decoding="async" width="1024" height="536" src="https://getsdeready.com/wp-content/uploads/2025/09/Types-of-Caching-Strategies-1024x536.webp" class="attachment-large size-large wp-image-45944" alt="Types of Caching Strategies" srcset="https://getsdeready.com/wp-content/uploads/2025/09/Types-of-Caching-Strategies-1024x536.webp 1024w, https://getsdeready.com/wp-content/uploads/2025/09/Types-of-Caching-Strategies-300x157.webp 300w, https://getsdeready.com/wp-content/uploads/2025/09/Types-of-Caching-Strategies-768x402.webp 768w, https://getsdeready.com/wp-content/uploads/2025/09/Types-of-Caching-Strategies-50x26.webp 50w, https://getsdeready.com/wp-content/uploads/2025/09/Types-of-Caching-Strategies-100x52.webp 100w, https://getsdeready.com/wp-content/uploads/2025/09/Types-of-Caching-Strategies-600x314.webp 600w, https://getsdeready.com/wp-content/uploads/2025/09/Types-of-Caching-Strategies-96x50.webp 96w, https://getsdeready.com/wp-content/uploads/2025/09/Types-of-Caching-Strategies.webp 1200w" sizes="(max-width: 1024px) 100vw, 1024px" />															</div>
				</div>
				<div class="elementor-element elementor-element-851717b elementor-widget elementor-widget-text-editor" data-id="851717b" data-element_type="widget" data-e-type="widget" data-widget_type="text-editor.default">
				<div class="elementor-widget-container">
									<h3>Write-Through</h3><p><span style="font-weight: 400;">Writes update both cache and database synchronously.</span></p><ul><li style="font-weight: 400;" aria-level="1">How It Works<span style="font-weight: 400;">: Application writes to cache, which then persists to DB before acknowledging.</span></li><li style="font-weight: 400;" aria-level="1">Pros<span style="font-weight: 400;">: Strong consistency—no stale data; reduces future read latency.</span></li><li style="font-weight: 400;" aria-level="1">Cons<span style="font-weight: 400;">: Higher write latency due to dual operations; can bottleneck under heavy writes.</span></li><li style="font-weight: 400;" aria-level="1">Use Case<span style="font-weight: 400;">: Financial apps where accuracy trumps speed, like stock trading platforms. Statistics from Microsoft Azure show write-through can maintain 99.99% data integrity but at 20-30% higher write costs.</span></li></ul><h3>Write-Around</h3><p><span style="font-weight: 400;">Writes go directly to the database, bypassing the cache; cache updates only on subsequent reads.</span></p><ul><li style="font-weight: 400;" aria-level="1">How It Works<span style="font-weight: 400;">: Combine with cache-aside—write to DB, invalidate cache if needed.</span></li><li style="font-weight: 400;" aria-level="1">Pros<span style="font-weight: 400;">: Avoids caching rarely read data; efficient for write-once-read-never patterns.</span></li><li style="font-weight: 400;" aria-level="1">Cons<span style="font-weight: 400;">: Recent writes cause cache misses on reads.</span></li><li style="font-weight: 400;" aria-level="1">Use Case<span style="font-weight: 400;">: Logging systems or time-series data. As noted in Medium articles on caching, this prevents cache pollution in write-heavy environments.</span></li></ul><h3>Write-Back (Write-Behind)</h3><p><span style="font-weight: 400;">Writes hit the cache first, with asynchronous updates to the database.</span></p><ul><li style="font-weight: 400;" aria-level="1">How It Works<span style="font-weight: 400;">: Cache acknowledges write immediately, batches updates to DB later.</span></li><li style="font-weight: 400;" aria-level="1">Pros<span style="font-weight: 400;">: Low write latency; high throughput for bursts.</span></li><li style="font-weight: 400;" aria-level="1">Cons<span style="font-weight: 400;">: Risk of data loss if cache fails before sync; eventual consistency.</span></li><li style="font-weight: 400;" aria-level="1">Use Case<span style="font-weight: 400;">: IoT data ingestion where immediate persistence isn&#8217;t critical. Redis benchmarks indicate write-back can handle 10x more writes per second than synchronous methods.</span></li></ul><h3>Refresh-Ahead</h3><p><span style="font-weight: 400;">Proactively refreshes cache entries before expiration based on access patterns.</span></p><ul><li style="font-weight: 400;" aria-level="1">How It Works<span style="font-weight: 400;">: Monitor usage and prefetch data—e.g., using predictive algorithms in distributed caches like Hazelcast.</span></li><li style="font-weight: 400;" aria-level="1">Pros<span style="font-weight: 400;">: Minimizes misses; ideal for predictable workloads.</span></li><li style="font-weight: 400;" aria-level="1">Cons<span style="font-weight: 400;">: Over-fetching wastes resources if predictions are wrong.</span></li><li style="font-weight: 400;" aria-level="1">Use Case<span style="font-weight: 400;">: E-commerce product catalogs with seasonal trends.</span></li></ul><p><span style="font-weight: 400;">For web developers integrating caching into full-stack apps, our</span><a href="https://getsdeready.com/courses/web-development/"> <span style="font-weight: 400;">web development course</span></a><span style="font-weight: 400;"> provides modules on implementing these strategies with tools like Redis.</span></p><h2>Pros and Cons: A Comparative Table</h2><p><span style="font-weight: 400;">To make selection easier, here&#8217;s a table summarizing key strategies:</span></p><table><tbody><tr><td><p>Strategy</p></td><td><p>Pros</p></td><td><p>Cons</p></td><td><p>Best For</p></td></tr><tr><td><p><span style="font-weight: 400;">Cache-Aside</span></p></td><td><p><span style="font-weight: 400;">Flexible, efficient memory use</span></p></td><td><p><span style="font-weight: 400;">Cache misses, thundering herd</span></p></td><td><p><span style="font-weight: 400;">Read-heavy, unpredictable access</span></p></td></tr><tr><td><p><span style="font-weight: 400;">Read-Through</span></p></td><td><p><span style="font-weight: 400;">Simplified code, consistency</span></p></td><td><p><span style="font-weight: 400;">Coupling, initial misses</span></p></td><td><p><span style="font-weight: 400;">Database-integrated apps</span></p></td></tr><tr><td><p><span style="font-weight: 400;">Write-Through</span></p></td><td><p><span style="font-weight: 400;">Strong consistency</span></p></td><td><p><span style="font-weight: 400;">High write latency</span></p></td><td><p><span style="font-weight: 400;">Consistency-critical systems</span></p></td></tr><tr><td><p><span style="font-weight: 400;">Write-Around</span></p></td><td><p><span style="font-weight: 400;">Avoids pollution</span></p></td><td><p><span style="font-weight: 400;">Misses on recent writes</span></p></td><td><p><span style="font-weight: 400;">Write-heavy, infrequent reads</span></p></td></tr><tr><td><p><span style="font-weight: 400;">Write-Back</span></p></td><td><p><span style="font-weight: 400;">Fast writes, high throughput</span></p></td><td><p><span style="font-weight: 400;">Data loss risk, eventual cons.</span></p></td><td><p><span style="font-weight: 400;">Burst traffic, IoT</span></p></td></tr><tr><td><p><span style="font-weight: 400;">Refresh-Ahead</span></p></td><td><p><span style="font-weight: 400;">Low misses</span></p></td><td><p><span style="font-weight: 400;">Resource waste on bad predicts</span></p></td><td><p><span style="font-weight: 400;">Predictable patterns</span></p></td></tr></tbody></table><p><span style="font-weight: 400;">Data from sources like The New Stack highlights that combining strategies (e.g., write-around with cache-aside) often yields the best results, balancing latency and complexity.</span></p>								</div>
				</div>
				<div class="elementor-element elementor-element-15322e5 elementor-widget elementor-widget-image" data-id="15322e5" data-element_type="widget" data-e-type="widget" data-widget_type="image.default">
				<div class="elementor-widget-container">
															<img loading="lazy" decoding="async" width="1024" height="536" src="https://getsdeready.com/wp-content/uploads/2025/09/Pros-and-Cons_-A-Comparative-Table-1024x536.webp" class="attachment-large size-large wp-image-45945" alt="Pros and Cons_ A Comparative Table" srcset="https://getsdeready.com/wp-content/uploads/2025/09/Pros-and-Cons_-A-Comparative-Table-1024x536.webp 1024w, https://getsdeready.com/wp-content/uploads/2025/09/Pros-and-Cons_-A-Comparative-Table-300x157.webp 300w, https://getsdeready.com/wp-content/uploads/2025/09/Pros-and-Cons_-A-Comparative-Table-768x402.webp 768w, https://getsdeready.com/wp-content/uploads/2025/09/Pros-and-Cons_-A-Comparative-Table-50x26.webp 50w, https://getsdeready.com/wp-content/uploads/2025/09/Pros-and-Cons_-A-Comparative-Table-100x52.webp 100w, https://getsdeready.com/wp-content/uploads/2025/09/Pros-and-Cons_-A-Comparative-Table-600x314.webp 600w, https://getsdeready.com/wp-content/uploads/2025/09/Pros-and-Cons_-A-Comparative-Table-96x50.webp 96w, https://getsdeready.com/wp-content/uploads/2025/09/Pros-and-Cons_-A-Comparative-Table.webp 1200w" sizes="(max-width: 1024px) 100vw, 1024px" />															</div>
				</div>
				<div class="elementor-element elementor-element-faf798f elementor-widget elementor-widget-text-editor" data-id="faf798f" data-element_type="widget" data-e-type="widget" data-widget_type="text-editor.default">
				<div class="elementor-widget-container">
									<h2>Best Practices and Actionable Advice</h2><p>Implementing caching effectively requires more than theory. Here are actionable tips:</p><ul><li style="font-weight: 400;" aria-level="1">Analyze Workloads: Use tools like New Relic to profile access patterns—cache hot data only.</li><li style="font-weight: 400;" aria-level="1">Set TTL Wisely: Start with 5-60 minutes; adjust based on data volatility.</li><li style="font-weight: 400;" aria-level="1">Handle Invalidation: Use event-driven approaches, like pub/sub in Redis, to evict stale entries.</li><li style="font-weight: 400;" aria-level="1">Monitor Metrics: Track hit rates (aim for &gt;80%), eviction rates, and latency. Quote from Redis.io: &#8220;A hit rate below 70% often indicates over-eviction or poor key design.&#8221;</li><li style="font-weight: 400;" aria-level="1">Security Considerations: Encrypt sensitive cached data; avoid caching PII.</li><li style="font-weight: 400;" aria-level="1">Scale with Distribution: For large systems, use sharded caches like Redis Cluster.</li></ul><p>If you&#8217;re tackling system design holistically, our<a href="https://getsdeready.com/courses/master-dsa-web-dev-system-design/"> master DSA, web dev, and system design course</a> covers caching in distributed environments.</p><h2>Caching in Distributed Systems</h2><p>In microservices or cloud setups, caching evolves. Distributed caches like Redis or Memcached share data across nodes, but introduce challenges like consistency (eventual vs. strong) and partitioning.</p><ul><li style="font-weight: 400;" aria-level="1">Key Concepts: Sharding for load balancing, replication for fault tolerance.</li><li style="font-weight: 400;" aria-level="1">Challenges: Network latency, coherence issues—solved via protocols like MESI.</li><li style="font-weight: 400;" aria-level="1">Use Case: Amazon&#8217;s ElastiCache handles billions of operations daily, reducing DB load by 90%.</li></ul>								</div>
				</div>
				<div class="elementor-element elementor-element-ddb1231 elementor-widget elementor-widget-image" data-id="ddb1231" data-element_type="widget" data-e-type="widget" data-widget_type="image.default">
				<div class="elementor-widget-container">
															<img loading="lazy" decoding="async" width="1024" height="536" src="https://getsdeready.com/wp-content/uploads/2025/09/Caching-in-Distributed-Systems-1024x536.webp" class="attachment-large size-large wp-image-45943" alt="Caching in Distributed Systems" srcset="https://getsdeready.com/wp-content/uploads/2025/09/Caching-in-Distributed-Systems-1024x536.webp 1024w, https://getsdeready.com/wp-content/uploads/2025/09/Caching-in-Distributed-Systems-300x157.webp 300w, https://getsdeready.com/wp-content/uploads/2025/09/Caching-in-Distributed-Systems-768x402.webp 768w, https://getsdeready.com/wp-content/uploads/2025/09/Caching-in-Distributed-Systems-50x26.webp 50w, https://getsdeready.com/wp-content/uploads/2025/09/Caching-in-Distributed-Systems-100x52.webp 100w, https://getsdeready.com/wp-content/uploads/2025/09/Caching-in-Distributed-Systems-600x314.webp 600w, https://getsdeready.com/wp-content/uploads/2025/09/Caching-in-Distributed-Systems-96x50.webp 96w, https://getsdeready.com/wp-content/uploads/2025/09/Caching-in-Distributed-Systems.webp 1200w" sizes="(max-width: 1024px) 100vw, 1024px" />															</div>
				</div>
				<div class="elementor-element elementor-element-4ba8177 elementor-widget elementor-widget-text-editor" data-id="4ba8177" data-element_type="widget" data-e-type="widget" data-widget_type="text-editor.default">
				<div class="elementor-widget-container">
									<p>For data scientists dealing with large datasets, explore caching in analytics with our<a href="https://getsdeready.com/courses/data-science/"> data science course</a>.</p><h2>Interview Examples: Real Questions from Tech Interviews</h2><p>Caching is a staple in FAANG interviews, often tied to system design or coding problems. Below are 30+ high-quality questions reportedly asked at companies like Google, Amazon, and Meta, with in-depth answers drawing from real experiences (e.g., from GitHub repos, Devinterview.io, and Glassdoor reports). These go beyond basics, testing depth.</p><ol><li style="font-weight: 400;" aria-level="1">Define caching in computer programming. Caching stores frequently accessed data in fast memory to reduce retrieval time from slower sources. It improves performance by exploiting temporal and spatial locality. For example, in a web app, caching user profiles avoids repeated DB queries.</li><li style="font-weight: 400;" aria-level="1">What are the main purposes of caching? Primary goals: enhance speed (reduce latency), cut costs (fewer DB hits), scale systems (handle more traffic), and improve reliability (serve data during outages). Stats: Caching can boost throughput by 5-10x in read-heavy apps.</li><li style="font-weight: 400;" aria-level="1">Explain cache hit and miss. Hit: Data found in cache (fast access). Miss: Not found, fetch from source (slower). Types of misses: compulsory (first access), capacity (cache full), conflict (mapping issues). To minimize, use larger caches or better policies.</li><li style="font-weight: 400;" aria-level="1">Impact of cache size on performance? Larger caches increase hit rates but raise costs and potential latency from searches. Optimal size balances hit rate (e.g., 95%) with memory use—use formulas like Belady&#8217;s anomaly for prediction.</li><li style="font-weight: 400;" aria-level="1">Difference between local and distributed caching? Local: Per-instance, fast but not shared (e.g., Guava). Distributed: Across nodes, scalable but networked (e.g., Redis). Use local for low-latency, distributed for high-availability.</li><li style="font-weight: 400;" aria-level="1">Common cache eviction strategies? LRU (remove least recent), LFU (least frequent), FIFO (oldest first). LRU is popular for temporal locality; LFU for frequency-based workloads.</li><li style="font-weight: 400;" aria-level="1">What is a cache key? Unique identifier for cached data, often hashed (e.g., URL + params). Good keys ensure collisions are rare and eviction is fair.</li><li style="font-weight: 400;" aria-level="1">Importance of cache expiration? Prevents stale data; managed via TTL. Without it, caches grow indefinitely, leading to OOM errors.</li><li style="font-weight: 400;" aria-level="1">How does cache invalidation work? Remove or update entries on data change. Methods: manual (e.g., @CacheEvict in Spring), time-based, or event-driven.</li><li style="font-weight: 400;" aria-level="1">Steps to implement a basic cache? Use a map for storage, add get/put methods, implement eviction (e.g., LRU with LinkedHashMap in Java).</li><li style="font-weight: 400;" aria-level="1">Handle cache sync in distributed env? Use pub/sub (Redis) or consensus protocols (Zookeeper) for invalidation broadcasts.</li><li style="font-weight: 400;" aria-level="1">Role of hash maps in caches? O(1) access for keys; extended with doubly-linked lists for LRU.</li><li style="font-weight: 400;" aria-level="1">Caching algorithms and differences? Direct-mapped (fast, high conflicts), set-associative (balance), fully-associative (flexible, slow).</li><li style="font-weight: 400;" aria-level="1">Design for high concurrency? Use thread-safe structures (ConcurrentHashMap), locks, or sharding.</li><li style="font-weight: 400;" aria-level="1">Prevent cache stampede? Use probabilistic early expiration or locking on misses.</li><li style="font-weight: 400;" aria-level="1">Trade-offs: read vs write-heavy? Read-heavy: Favor read-through. Write-heavy: Write-back for speed, but risk inconsistency.</li><li style="font-weight: 400;" aria-level="1">Cache manifest in web apps? Lists resources for offline caching (Service Workers in PWA).</li><li style="font-weight: 400;" aria-level="1">Ensure cache-DB consistency? Write-through or invalidation events.</li><li style="font-weight: 400;" aria-level="1">Cache tagging benefits? Group-related items for bulk invalidation (e.g., all &#8220;user:123&#8221; tags).</li><li style="font-weight: 400;" aria-level="1">Distributed caching advantages? Scalability, redundancy over local; handles failures via replication.</li><li style="font-weight: 400;" aria-level="1">Handle partitioning in distributed? Consistent hashing to minimize reshuffling on node changes.</li><li style="font-weight: 400;" aria-level="1">Consistency models? Eventual (delayed sync, high avail), strong (immediate, low perf).</li><li style="font-weight: 400;" aria-level="1">Cache replication? Master-slave or peer-to-peer; sync via gossip protocols.</li><li style="font-weight: 400;" aria-level="1">Avoid coherence issues? Use write-invalidate or write-update protocols.</li><li style="font-weight: 400;" aria-level="1">Network latency in distributed? Locality-aware placement, compression, batching.</li><li style="font-weight: 400;" aria-level="1">Challenges in distributed cache? Partitioning, failure detection, hot spots—mitigate with auto-scaling.</li><li style="font-weight: 400;" aria-level="1">Write-through in distributed? Cache nodes write to shared DB synchronously.</li><li style="font-weight: 400;" aria-level="1">Handle node failures? Replication and failover; quorum reads/writes.</li><li style="font-weight: 400;" aria-level="1">Shared vs distributed cache? Shared: Single instance (bottleneck). Distributed: Multi-node (scalable).</li><li style="font-weight: 400;" aria-level="1">CDN and caching relation? CDNs cache at edges for low-latency global delivery.</li><li style="font-weight: 400;" aria-level="1">Edge caching use cases? Static assets in web apps; reduces origin load.</li><li style="font-weight: 400;" aria-level="1">Cache warming? Pre-populate cache on startup; for predictable queries.</li><li style="font-weight: 400;" aria-level="1">Query caching in DBs? Store results; invalidate on table changes.</li><li style="font-weight: 400;" aria-level="1">Object caching in OOP? Cache instances; reduces creation overhead.</li><li style="font-weight: 400;" aria-level="1">Caching in microservices? Per-service caches with central invalidation.</li><li style="font-weight: 400;" aria-level="1">Serverless caching? Use managed services like AWS ElastiCache.</li></ol><p>For quick prep, our<a href="https://getsdeready.com/crash-course/"> crash course</a> condenses these into bite-sized lessons.</p><h2>Conclusion</h2><p>Caching strategies are the unsung heroes of performant systems, turning potential bottlenecks into seamless experiences. By mastering these, you&#8217;ll not only optimize your code but ace interviews too. Ready to apply this? Experiment with a small project—implement cache-aside in your app and measure the gains. What&#8217;s your go-to caching strategy? Share in the comments!</p><p>For more on advanced topics, explore our courses.</p><h3>FAQs</h3>								</div>
				</div>
				<div class="elementor-element elementor-element-39bd5a3 blog-faq elementor-widget elementor-widget-n-accordion" data-id="39bd5a3" data-element_type="widget" data-e-type="widget" data-settings="{&quot;default_state&quot;:&quot;expanded&quot;,&quot;max_items_expended&quot;:&quot;one&quot;,&quot;n_accordion_animation_duration&quot;:{&quot;unit&quot;:&quot;ms&quot;,&quot;size&quot;:400,&quot;sizes&quot;:[]}}" data-widget_type="nested-accordion.default">
				<div class="elementor-widget-container">
							<div class="e-n-accordion" aria-label="Accordion. Open links with Enter or Space, close with Escape, and navigate with Arrow Keys">
						<details id="e-n-accordion-item-6050" class="e-n-accordion-item" open>
				<summary class="e-n-accordion-item-title" data-accordion-index="1" tabindex="0" aria-expanded="true" aria-controls="e-n-accordion-item-6050" >
					<span class='e-n-accordion-item-title-header'><h3 class="e-n-accordion-item-title-text"> What are the best caching strategies for beginners?  </h3></span>
							<span class='e-n-accordion-item-title-icon'>
			<span class='e-opened' ><svg aria-hidden="true" class="e-font-icon-svg e-fas-minus" viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M416 208H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h384c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z"></path></svg></span>
			<span class='e-closed'><svg aria-hidden="true" class="e-font-icon-svg e-fas-plus" viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M416 208H272V64c0-17.67-14.33-32-32-32h-32c-17.67 0-32 14.33-32 32v144H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h144v144c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32V304h144c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z"></path></svg></span>
		</span>

						</summary>
				<div role="region" aria-labelledby="e-n-accordion-item-6050" class="elementor-element elementor-element-833d55f e-con-full e-flex e-con e-child" data-id="833d55f" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-540c17d elementor-widget elementor-widget-text-editor" data-id="540c17d" data-element_type="widget" data-e-type="widget" data-widget_type="text-editor.default">
				<div class="elementor-widget-container">
									<ol><li style="font-weight: 400;" aria-level="1"><span style="font-weight: 400;">Start with cache-aside for its simplicity in handling read-heavy web apps and databases.</span></li></ol>								</div>
				</div>
				</div>
					</details>
						<details id="e-n-accordion-item-6051" class="e-n-accordion-item" >
				<summary class="e-n-accordion-item-title" data-accordion-index="2" tabindex="-1" aria-expanded="false" aria-controls="e-n-accordion-item-6051" >
					<span class='e-n-accordion-item-title-header'><h3 class="e-n-accordion-item-title-text"> How does caching improve system design interview performance? </h3></span>
							<span class='e-n-accordion-item-title-icon'>
			<span class='e-opened' ><svg aria-hidden="true" class="e-font-icon-svg e-fas-minus" viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M416 208H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h384c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z"></path></svg></span>
			<span class='e-closed'><svg aria-hidden="true" class="e-font-icon-svg e-fas-plus" viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M416 208H272V64c0-17.67-14.33-32-32-32h-32c-17.67 0-32 14.33-32 32v144H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h144v144c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32V304h144c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z"></path></svg></span>
		</span>

						</summary>
				<div role="region" aria-labelledby="e-n-accordion-item-6051" class="elementor-element elementor-element-56a8730 e-con-full e-flex e-con e-child" data-id="56a8730" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-2005924 elementor-widget elementor-widget-text-editor" data-id="2005924" data-element_type="widget" data-e-type="widget" data-widget_type="text-editor.default">
				<div class="elementor-widget-container">
									<ol><li style="font-weight: 400;" aria-level="1"><span style="font-weight: 400;">Demonstrating strategies like LRU eviction shows deep understanding of scalability and latency optimization.</span></li></ol>								</div>
				</div>
				</div>
					</details>
					</div>
					
							</div>
				</div>
				<div class="elementor-element elementor-element-ddc4957 blog-faq elementor-widget elementor-widget-n-accordion" data-id="ddc4957" data-element_type="widget" data-e-type="widget" data-settings="{&quot;default_state&quot;:&quot;expanded&quot;,&quot;max_items_expended&quot;:&quot;one&quot;,&quot;n_accordion_animation_duration&quot;:{&quot;unit&quot;:&quot;ms&quot;,&quot;size&quot;:400,&quot;sizes&quot;:[]}}" data-widget_type="nested-accordion.default">
				<div class="elementor-widget-container">
							<div class="e-n-accordion" aria-label="Accordion. Open links with Enter or Space, close with Escape, and navigate with Arrow Keys">
						<details id="e-n-accordion-item-2320" class="e-n-accordion-item" open>
				<summary class="e-n-accordion-item-title" data-accordion-index="1" tabindex="0" aria-expanded="true" aria-controls="e-n-accordion-item-2320" >
					<span class='e-n-accordion-item-title-header'><h3 class="e-n-accordion-item-title-text"> Pros and cons of write-through caching? </h3></span>
							<span class='e-n-accordion-item-title-icon'>
			<span class='e-opened' ><svg aria-hidden="true" class="e-font-icon-svg e-fas-minus" viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M416 208H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h384c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z"></path></svg></span>
			<span class='e-closed'><svg aria-hidden="true" class="e-font-icon-svg e-fas-plus" viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M416 208H272V64c0-17.67-14.33-32-32-32h-32c-17.67 0-32 14.33-32 32v144H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h144v144c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32V304h144c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z"></path></svg></span>
		</span>

						</summary>
				<div role="region" aria-labelledby="e-n-accordion-item-2320" class="elementor-element elementor-element-265c51e e-con-full e-flex e-con e-child" data-id="265c51e" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-ea2d882 elementor-widget elementor-widget-text-editor" data-id="ea2d882" data-element_type="widget" data-e-type="widget" data-widget_type="text-editor.default">
				<div class="elementor-widget-container">
									<ol><li style="font-weight: 400;" aria-level="1"><span style="font-weight: 400;">Pros: Data consistency; Cons: Higher latency—ideal for accuracy-focused apps like finance.</span></li></ol>								</div>
				</div>
				</div>
					</details>
						<details id="e-n-accordion-item-2321" class="e-n-accordion-item" >
				<summary class="e-n-accordion-item-title" data-accordion-index="2" tabindex="-1" aria-expanded="false" aria-controls="e-n-accordion-item-2321" >
					<span class='e-n-accordion-item-title-header'><h3 class="e-n-accordion-item-title-text"> How to handle cache invalidation in interviews? </h3></span>
							<span class='e-n-accordion-item-title-icon'>
			<span class='e-opened' ><svg aria-hidden="true" class="e-font-icon-svg e-fas-minus" viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M416 208H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h384c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z"></path></svg></span>
			<span class='e-closed'><svg aria-hidden="true" class="e-font-icon-svg e-fas-plus" viewBox="0 0 448 512" xmlns="http://www.w3.org/2000/svg"><path d="M416 208H272V64c0-17.67-14.33-32-32-32h-32c-17.67 0-32 14.33-32 32v144H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h144v144c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32V304h144c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z"></path></svg></span>
		</span>

						</summary>
				<div role="region" aria-labelledby="e-n-accordion-item-2321" class="elementor-element elementor-element-1805c9a e-con-full e-flex e-con e-child" data-id="1805c9a" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-9f4260d elementor-widget elementor-widget-text-editor" data-id="9f4260d" data-element_type="widget" data-e-type="widget" data-widget_type="text-editor.default">
				<div class="elementor-widget-container">
									<ol><li style="font-weight: 400;" aria-level="1"><span style="font-weight: 400;"> Discuss methods like TTL or event-driven eviction to prevent stale data in distributed systems.</span></li></ol>								</div>
				</div>
				</div>
					</details>
					</div>
					
							</div>
				</div>
				</div>
		<div class="elementor-element elementor-element-39f7646 e-con-full elementor-hidden-mobile e-flex e-con e-child" data-id="39f7646" data-element_type="container" data-e-type="container">
		<div class="elementor-element elementor-element-a792924 e-con-full e-flex e-con e-child" data-id="a792924" data-element_type="container" data-e-type="container" data-settings="{&quot;sticky&quot;:&quot;top&quot;,&quot;sticky_offset&quot;:30,&quot;sticky_parent&quot;:&quot;yes&quot;,&quot;sticky_on&quot;:[&quot;desktop&quot;,&quot;tablet&quot;,&quot;mobile&quot;],&quot;sticky_effects_offset&quot;:0,&quot;sticky_anchor_link_offset&quot;:0}">
				<div class="elementor-element elementor-element-2ca6f07 elementor-grid-1 elementor-grid-tablet-2 elementor-grid-mobile-1 elementor-widget elementor-widget-loop-grid" data-id="2ca6f07" data-element_type="widget" data-e-type="widget" data-settings="{&quot;template_id&quot;:&quot;30707&quot;,&quot;columns&quot;:1,&quot;_skin&quot;:&quot;post&quot;,&quot;columns_tablet&quot;:&quot;2&quot;,&quot;columns_mobile&quot;:&quot;1&quot;,&quot;edit_handle_selector&quot;:&quot;[data-elementor-type=\&quot;loop-item\&quot;]&quot;,&quot;row_gap&quot;:{&quot;unit&quot;:&quot;px&quot;,&quot;size&quot;:&quot;&quot;,&quot;sizes&quot;:[]},&quot;row_gap_tablet&quot;:{&quot;unit&quot;:&quot;px&quot;,&quot;size&quot;:&quot;&quot;,&quot;sizes&quot;:[]},&quot;row_gap_mobile&quot;:{&quot;unit&quot;:&quot;px&quot;,&quot;size&quot;:&quot;&quot;,&quot;sizes&quot;:[]}}" data-widget_type="loop-grid.post">
				<div class="elementor-widget-container">
							<div class="elementor-loop-container elementor-grid" role="list">
		<style id="loop-30707">.elementor-30707 .elementor-element.elementor-element-3bfce03{--display:flex;--flex-direction:column;--container-widget-width:100%;--container-widget-height:initial;--container-widget-flex-grow:0;--container-widget-align-self:initial;--flex-wrap-mobile:wrap;--gap:5px 5px;--row-gap:5px;--column-gap:5px;border-style:solid;--border-style:solid;border-width:1px 1px 1px 1px;--border-top-width:1px;--border-right-width:1px;--border-bottom-width:1px;--border-left-width:1px;border-color:#E9E9E9;--border-color:#E9E9E9;--border-radius:5px 5px 5px 5px;--padding-top:0px;--padding-bottom:0px;--padding-left:0px;--padding-right:0px;}.elementor-30707 .elementor-element.elementor-element-3bfce03:not(.elementor-motion-effects-element-type-background), .elementor-30707 .elementor-element.elementor-element-3bfce03 > .elementor-motion-effects-container > .elementor-motion-effects-layer{background-color:#FFFFFF;}.elementor-widget-theme-post-featured-image .widget-image-caption{color:var( --e-global-color-text );font-family:var( --e-global-typography-text-font-family ), Sans-serif;font-weight:var( --e-global-typography-text-font-weight );}.elementor-30707 .elementor-element.elementor-element-62ff770 img{width:100%;height:200px;object-fit:cover;object-position:center center;border-radius:5px 5px 0px 0px;}.elementor-widget-heading .elementor-heading-title{font-family:var( --e-global-typography-primary-font-family ), Sans-serif;font-weight:var( --e-global-typography-primary-font-weight );color:var( --e-global-color-primary );}.elementor-30707 .elementor-element.elementor-element-fb51e5c > .elementor-widget-container{padding:0px 20px 0px 20px;}.elementor-30707 .elementor-element.elementor-element-fb51e5c .elementor-heading-title{font-family:"Poppins", Sans-serif;font-size:20px;font-weight:600;line-height:29px;color:var( --e-global-color-02e7e8c );}.elementor-widget-icon-list .elementor-icon-list-item:not(:last-child):after{border-color:var( --e-global-color-text );}.elementor-widget-icon-list .elementor-icon-list-icon i{color:var( --e-global-color-primary );}.elementor-widget-icon-list .elementor-icon-list-icon svg{fill:var( --e-global-color-primary );}.elementor-widget-icon-list .elementor-icon-list-item > .elementor-icon-list-text, .elementor-widget-icon-list .elementor-icon-list-item > a{font-family:var( --e-global-typography-text-font-family ), Sans-serif;font-weight:var( --e-global-typography-text-font-weight );}.elementor-widget-icon-list .elementor-icon-list-text{color:var( --e-global-color-secondary );}.elementor-30707 .elementor-element.elementor-element-716c418 > .elementor-widget-container{margin:0px 0px 0px 20px;}.elementor-30707 .elementor-element.elementor-element-716c418 .elementor-icon-list-items:not(.elementor-inline-items) .elementor-icon-list-item:not(:last-child){padding-block-end:calc(8px/2);}.elementor-30707 .elementor-element.elementor-element-716c418 .elementor-icon-list-items:not(.elementor-inline-items) .elementor-icon-list-item:not(:first-child){margin-block-start:calc(8px/2);}.elementor-30707 .elementor-element.elementor-element-716c418 .elementor-icon-list-items.elementor-inline-items .elementor-icon-list-item{margin-inline:calc(8px/2);}.elementor-30707 .elementor-element.elementor-element-716c418 .elementor-icon-list-items.elementor-inline-items{margin-inline:calc(-8px/2);}.elementor-30707 .elementor-element.elementor-element-716c418 .elementor-icon-list-items.elementor-inline-items .elementor-icon-list-item:after{inset-inline-end:calc(-8px/2);}.elementor-30707 .elementor-element.elementor-element-716c418 .elementor-icon-list-icon i{color:var( --e-global-color-0c0e3ea );transition:color 0.3s;}.elementor-30707 .elementor-element.elementor-element-716c418 .elementor-icon-list-icon svg{fill:var( --e-global-color-0c0e3ea );transition:fill 0.3s;}.elementor-30707 .elementor-element.elementor-element-716c418{--e-icon-list-icon-size:18px;--icon-vertical-offset:0px;}.elementor-30707 .elementor-element.elementor-element-716c418 .elementor-icon-list-icon{padding-inline-end:10px;}.elementor-30707 .elementor-element.elementor-element-716c418 .elementor-icon-list-item > .elementor-icon-list-text, .elementor-30707 .elementor-element.elementor-element-716c418 .elementor-icon-list-item > a{font-family:"Poppins", Sans-serif;font-size:14px;font-weight:400;}.elementor-30707 .elementor-element.elementor-element-716c418 .elementor-icon-list-text{color:var( --e-global-color-02e7e8c );transition:color 0.3s;}.elementor-30707 .elementor-element.elementor-element-a3a97ee{--display:flex;--flex-direction:row;--container-widget-width:calc( ( 1 - var( --container-widget-flex-grow ) ) * 100% );--container-widget-height:100%;--container-widget-flex-grow:1;--container-widget-align-self:stretch;--flex-wrap-mobile:wrap;--justify-content:space-between;--align-items:center;--gap:10px 10px;--row-gap:10px;--column-gap:10px;border-style:solid;--border-style:solid;border-width:1px 0px 0px 0px;--border-top-width:1px;--border-right-width:0px;--border-bottom-width:0px;--border-left-width:0px;border-color:#E9E9E9;--border-color:#E9E9E9;--padding-top:5px;--padding-bottom:5px;--padding-left:20px;--padding-right:20px;}.elementor-30707 .elementor-element.elementor-element-e6398d7{width:var( --container-widget-width, 55% );max-width:55%;--container-widget-width:55%;--container-widget-flex-grow:0;}.elementor-30707 .elementor-element.elementor-element-e6398d7 .elementor-heading-title{font-family:"Poppins", Sans-serif;font-size:20px;font-weight:600;color:#000000;}.elementor-widget-button .elementor-button{background-color:var( --e-global-color-accent );font-family:var( --e-global-typography-accent-font-family ), Sans-serif;font-weight:var( --e-global-typography-accent-font-weight );}.elementor-30707 .elementor-element.elementor-element-856e4c2 .elementor-button{background-color:transparent;font-family:"Poppins", Sans-serif;font-size:15px;font-weight:400;background-image:linear-gradient(180deg, var( --e-global-color-0c0e3ea ) 0%, var( --e-global-color-2cbe65d ) 100%);border-radius:5px 5px 5px 5px;padding:10px 20px 10px 20px;}@media(max-width:767px){.elementor-30707 .elementor-element.elementor-element-a3a97ee{--align-items:center;--container-widget-width:calc( ( 1 - var( --container-widget-flex-grow ) ) * 100% );--flex-wrap:nowrap;}.elementor-30707 .elementor-element.elementor-element-e6398d7{--container-widget-width:60%;--container-widget-flex-grow:0;width:var( --container-widget-width, 60% );max-width:60%;}.elementor-30707 .elementor-element.elementor-element-856e4c2{width:var( --container-widget-width, 50% );max-width:50%;--container-widget-width:50%;--container-widget-flex-grow:0;}}</style>		<div data-elementor-type="loop-item" data-elementor-id="30707" class="elementor elementor-30707 e-loop-item e-loop-item-571 post-571 courses type-courses status-publish has-post-thumbnail hentry course-category-featured course-tag-algorithms course-tag-data-structures course-tag-high-level-system-design course-tag-low-level-system-design course-tag-programming course-tag-systemdesign" data-elementor-post-type="elementor_library" data-custom-edit-handle="1">
			<div class="elementor-element elementor-element-3bfce03 e-flex e-con-boxed e-con e-parent" data-id="3bfce03" data-element_type="container" data-e-type="container" data-settings="{&quot;background_background&quot;:&quot;classic&quot;}">
					<div class="e-con-inner">
				<div class="elementor-element elementor-element-62ff770 elementor-widget elementor-widget-theme-post-featured-image elementor-widget-image" data-id="62ff770" data-element_type="widget" data-e-type="widget" data-widget_type="theme-post-featured-image.default">
				<div class="elementor-widget-container">
															<img loading="lazy" decoding="async" width="768" height="432" src="https://getsdeready.com/wp-content/uploads/2024/03/10-min.png" class="attachment-full size-full wp-image-13205" alt="" srcset="https://getsdeready.com/wp-content/uploads/2024/03/10-min.png 768w, https://getsdeready.com/wp-content/uploads/2024/03/10-min-300x169.png 300w, https://getsdeready.com/wp-content/uploads/2024/03/10-min-160x90.png 160w, https://getsdeready.com/wp-content/uploads/2024/03/10-min-600x338.png 600w, https://getsdeready.com/wp-content/uploads/2024/03/10-min-89x50.png 89w" sizes="(max-width: 768px) 100vw, 768px" />															</div>
				</div>
				<div class="elementor-element elementor-element-fb51e5c elementor-widget elementor-widget-heading" data-id="fb51e5c" data-element_type="widget" data-e-type="widget" data-widget_type="heading.default">
				<div class="elementor-widget-container">
					<h2 class="elementor-heading-title elementor-size-default">DSA, High &#038; Low Level System Designs</h2>				</div>
				</div>
				<div class="elementor-element elementor-element-716c418 elementor-icon-list--layout-traditional elementor-list-item-link-full_width elementor-widget elementor-widget-icon-list" data-id="716c418" data-element_type="widget" data-e-type="widget" data-widget_type="icon-list.default">
				<div class="elementor-widget-container">
							<ul class="elementor-icon-list-items">
							<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><title>video-camera</title><path d="M30.395 6.362c-0.112-0.071-0.248-0.113-0.395-0.113-0.122 0-0.238 0.030-0.34 0.082l0.004-0.002-6.938 3.468c-0.106-1.426-1.287-2.543-2.729-2.548h-15.996c-1.518 0.002-2.748 1.232-2.75 2.75v12.001c0.002 1.518 1.232 2.748 2.75 2.75h15.996c1.443-0.005 2.623-1.122 2.729-2.538l0.001-0.009 6.939 3.468c0.097 0.050 0.211 0.080 0.333 0.080 0.001 0 0.002 0 0.003 0h-0c0.001 0 0.001 0 0.002 0 0.413 0 0.748-0.335 0.748-0.748 0-0.001 0-0.001 0-0.002v0-18c-0-0.268-0.141-0.503-0.352-0.636l-0.003-0.002zM21.246 22c-0.001 0.69-0.56 1.249-1.25 1.25h-15.996c-0.69-0.001-1.249-0.56-1.25-1.25v-12.001c0.001-0.69 0.56-1.249 1.25-1.25h15.996c0.69 0.001 1.249 0.56 1.25 1.25v12.001zM29.25 23.787l-6.504-3.25v-9.073l6.504-3.251z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">85+ Live Classes &amp; Recordings</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32" data-name="Layer 1" id="Layer_1" stroke="#0634A1" stroke-width="0.16"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><path d="M18,6V7H17a1,1,0,0,1-1-1V4h1V6Z"></path><path d="M17,6V7h1a1,1,0,0,0,1-1V4H18V6Z"></path><path d="M18,2V1H17a1,1,0,0,0-1,1V3h1V2Z"></path><path d="M17,2V1h1a1,1,0,0,1,1,1V4H18V2Z"></path><rect height="1" transform="translate(27 53) rotate(180)" width="19" x="4" y="26"></rect><rect height="1" transform="translate(32 59) rotate(180)" width="18" x="7" y="29"></rect><rect height="1" transform="translate(42 -13) rotate(90)" width="21" x="17" y="14"></rect><rect height="1" transform="translate(22.5 7.5) rotate(90)" width="22" x="-3.5" y="14.5"></rect><path d="M28,25H27v2a2,2,0,0,1-2,2h0v1h0a3,3,0,0,0,3-3Z"></path><path d="M22,26h1v1a2,2,0,0,0,2,2h0v1h0a3,3,0,0,1-3-3Z"></path><path d="M4,26H5v1a2,2,0,0,0,2,2H8v1H7a3,3,0,0,1-3-3Z"></path><rect height="1" width="17" x="9" y="2"></rect><path d="M25,2V3h1a1,1,0,0,1,1,1V5h1V4a2,2,0,0,0-2-2Z"></path><path d="M10,2V3H9A1,1,0,0,0,8,4V5H7V4A2,2,0,0,1,9,2Z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">24*7 Live Doubt Support</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Capa_1" viewBox="0 0 442 442" xml:space="preserve"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <path d="M179.046,93.365h84.845c2.761,0,5-2.239,5-5s-2.239-5-5-5h-84.845c-2.761,0-5,2.239-5,5S176.285,93.365,179.046,93.365z"></path> <path d="M122.977,120.046H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,120.046,122.977,120.046z "></path> <path d="M122.977,146.728H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,146.728,122.977,146.728z "></path> <path d="M122.977,173.409H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,173.409,122.977,173.409z "></path> <path d="M122.977,200.091H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,200.091,122.977,200.091z "></path> <path d="M122.977,226.772H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,226.772,122.977,226.772z "></path> <path d="M122.977,253.454H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,253.454,122.977,253.454z "></path> <path d="M122.977,280.135H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,280.135,122.977,280.135z "></path> <path d="M122.977,306.816H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,306.816,122.977,306.816z "></path> <path d="M232.008,323.498H122.977c-2.761,0-5,2.239-5,5s2.239,5,5,5h109.031c2.761,0,5-2.239,5-5S234.769,323.498,232.008,323.498z "></path> <path d="M385.536,68.464l-67-67C317.598,0.527,316.326,0,315,0H60c-2.761,0-5,2.239-5,5v432c0,2.761,2.239,5,5,5h322 c2.761,0,5-2.239,5-5V72C387,70.674,386.473,69.402,385.536,68.464z M320,17.071L369.929,67H320V17.071z M65,432V10h245v62 c0,2.761,2.239,5,5,5h62v355H65z"></path> <path d="M329.39,357.142c-0.717-1.979-2.596-3.298-4.702-3.298s-3.985,1.319-4.702,3.298l-15.366,42.453 c-0.939,2.597,0.403,5.463,3,6.403c0.562,0.203,1.136,0.3,1.701,0.3c2.046,0,3.966-1.265,4.702-3.3l4.001-11.055h13.326 l4.001,11.055c0.94,2.596,3.805,3.938,6.403,3c2.597-0.94,3.939-3.807,3-6.403L329.39,357.142z M321.645,381.943l3.043-8.409 l3.044,8.409H321.645z"></path> <path d="M342.466,304.771l-83.996,83.996c-1.953,1.953-1.953,5.119,0,7.071c0.977,0.976,2.256,1.464,3.536,1.464 s2.559-0.488,3.536-1.464l83.996-83.996c1.953-1.953,1.953-5.119,0-7.071C347.584,302.819,344.419,302.819,342.466,304.771z"></path> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">400+ DSA Practice Questions</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 24 24"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><path d="M20,6.52797748 L20,19.5 C20,20.8807119 18.8807119,22 17.5,22 L6.5,22 C5.11928813,22 4,20.8807119 4,19.5 L4,4.5 C4,3.11928813 5.11928813,2 6.5,2 L15.4720225,2 C15.6047688,1.99158053 15.7429463,2.03583949 15.8535534,2.14644661 L19.8535534,6.14644661 C19.9641605,6.25705373 20.0084195,6.39523125 20,6.52797748 Z M15,3 L6.5,3 C5.67157288,3 5,3.67157288 5,4.5 L5,19.5 C5,20.3284271 5.67157288,21 6.5,21 L17.5,21 C18.3284271,21 19,20.3284271 19,19.5 L19,7 L15.5,7 C15.2238576,7 15,6.77614237 15,6.5 L15,3 Z M16,3.70710678 L16,6 L18.2928932,6 L16,3.70710678 Z M12,16.2928932 L14.1464466,14.1464466 C14.3417088,13.9511845 14.6582912,13.9511845 14.8535534,14.1464466 C15.0488155,14.3417088 15.0488155,14.6582912 14.8535534,14.8535534 L11.9198269,17.7872799 C11.8307203,17.9246987 11.6759769,18.0156098 11.5,18.0156098 C11.3240231,18.0156098 11.1692797,17.9246987 11.0801731,17.7872799 L8.14644661,14.8535534 C7.95118446,14.6582912 7.95118446,14.3417088 8.14644661,14.1464466 C8.34170876,13.9511845 8.65829124,13.9511845 8.85355339,14.1464466 L11,16.2928932 L11,9.5 C11,9.22385763 11.2238576,9 11.5,9 C11.7761424,9 12,9.22385763 12,9.5 L12,16.2928932 L12,16.2928932 Z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">Comprehensive Notes</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Capa_1" viewBox="0 0 394.497 394.497" xml:space="preserve"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <path d="M181.239,84.373c-30.412,30.413-30.412,79.896,0,110.309c15.206,15.206,35.18,22.809,55.154,22.809 s39.948-7.603,55.154-22.809c30.412-30.413,30.412-79.896,0-110.309C261.136,53.961,211.651,53.961,181.239,84.373z M295,174.026 v-68.998C307.48,126.239,307.48,152.817,295,174.026z M285,91.994v95.067c-0.177,0.181-0.343,0.37-0.522,0.55 c-26.514,26.512-69.652,26.514-96.168,0c-3.953-3.953-7.302-8.281-10.076-12.862H184c2.762,0,5-2.239,5-5s-2.238-5-5-5h-10.747 c-3.926-9.869-5.447-20.475-4.576-30.92H208c2.762,0,5-2.239,5-5s-2.238-5-5-5h-37.742c2.653-11.26,8.213-21.961,16.66-30.92H251 c2.762,0,5-2.239,5-5s-2.238-5-5-5h-52.269c11.361-7.562,24.51-11.349,37.662-11.349c17.413,0,34.827,6.628,48.084,19.885 C284.657,91.624,284.823,91.813,285,91.994z"></path> <path d="M389.225,266.902l-72.44-72.44c11.022-16.057,16.958-35.038,16.958-54.935c0-26.002-10.127-50.449-28.514-68.835 c-7.583-7.583-16.125-13.624-25.229-18.177V7.749c0-2.761-2.238-5-5-5H55.69c-1.326,0-2.598,0.527-3.535,1.464l-50.69,50.68 C0.527,55.831,0,57.103,0,58.429v328.32c0,2.761,2.238,5,5,5h270c2.762,0,5-2.239,5-5V226.54c3.882-1.941,7.658-4.157,11.303-6.649 l72.467,72.467c3.509,3.509,8.117,5.264,12.728,5.264c4.608,0,9.219-1.755,12.728-5.264c3.4-3.399,5.272-7.92,5.272-12.728 C394.497,274.822,392.625,270.302,389.225,266.902z M323.742,139.527c0,23.332-9.086,45.267-25.584,61.764 c-34.059,34.058-89.471,34.057-123.529,0c-16.498-16.498-25.584-38.433-25.584-61.764s9.086-45.267,25.584-61.764 c17.029-17.028,39.396-25.542,61.765-25.542s44.735,8.514,61.765,25.542C314.656,94.261,323.742,116.196,323.742,139.527z M50.69,19.817v33.611H17.073L50.69,19.817z M270,381.749H10V63.429h45.69c2.762,0,5-2.239,5-5v-45.68H270v35.448 c-34.511-12.638-74.79-5.156-102.441,22.496c-6.161,6.161-11.389,13.005-15.625,20.357h-46.932c-2.762,0-5,2.239-5,5s2.238,5,5,5 h41.922c-2.822,6.557-4.91,13.424-6.224,20.5H48.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h90.871c-0.213,2.64-0.326,5.301-0.326,7.979 c0,4.222,0.271,8.401,0.797,12.521H93c-2.762,0-5,2.239-5,5s2.238,5,5,5h48.656c1.676,7.109,4.145,13.978,7.364,20.5H48.5 c-2.762,0-5,2.239-5,5s2.238,5,5,5h106.222c3.678,5.64,7.964,10.941,12.836,15.814c1.642,1.642,3.343,3.186,5.07,4.686H155.5 c-2.762,0-5,2.239-5,5s2.238,5,5,5h30.89c15.335,9.179,32.667,13.781,50.004,13.781c11.394,0,22.781-2.006,33.606-5.971V381.749z M305.229,208.363c1.899-1.899,3.705-3.866,5.426-5.89l51.275,51.275l-11.314,11.314l-51.295-51.295 C301.341,212.053,303.322,210.269,305.229,208.363z M382.154,285.287c-3.119,3.119-8.195,3.119-11.314,0l-13.154-13.154 L369,260.819l13.154,13.154c1.511,1.511,2.343,3.52,2.343,5.657S383.665,283.776,382.154,285.287z"></path> <path d="M48.5,101.049h40.001c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,101.049,48.5,101.049z"></path> <path d="M48.5,162.049h27.501c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,162.049,48.5,162.049z"></path> <path d="M48.5,223.049h92.301c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,223.049,48.5,223.049z"></path> <path d="M231.5,243.549H86.501c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,243.549,231.5,243.549z"></path> <path d="M48.5,253.549h22.001c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,253.549,48.5,253.549z"></path> <path d="M231.5,304.549h-94.499c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,304.549,231.5,304.549z"></path> <path d="M48.5,314.549h72.801c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,314.549,48.5,314.549z"></path> <path d="M231.5,335.049H178c-2.762,0-5,2.239-5,5s2.238,5,5,5h53.5c2.762,0,5-2.239,5-5S234.262,335.049,231.5,335.049z"></path> <path d="M163.101,335.049h-89.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h89.5c2.762,0,5-2.239,5-5S165.862,335.049,163.101,335.049z"></path> <path d="M58.501,335.049H48.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h10.001c2.762,0,5-2.239,5-5S61.263,335.049,58.501,335.049z"></path> <path d="M231.5,274.049h-30.499c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,274.049,231.5,274.049z"></path> <path d="M48.5,284.049h135c2.762,0,5-2.239,5-5s-2.238-5-5-5h-135c-2.762,0-5,2.239-5,5S45.738,284.049,48.5,284.049z"></path> <path d="M251,123.829h-17.5c-2.762,0-5,2.239-5,5s2.238,5,5,5H251c2.762,0,5-2.239,5-5S253.762,123.829,251,123.829z"></path> <path d="M251,164.749h-46c-2.762,0-5,2.239-5,5s2.238,5,5,5h46c2.762,0,5-2.239,5-5S253.762,164.749,251,164.749z"></path> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">HackerRank Tests &amp; Quizzes</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><title>screen-users</title><path d="M9.74 21c-0.001-1.721-1.396-3.115-3.116-3.115s-3.116 1.395-3.116 3.116 1.395 3.116 3.116 3.116v0c1.721-0.002 3.115-1.397 3.116-3.117v-0zM5.008 21c0.001-0.892 0.724-1.615 1.616-1.615s1.616 0.724 1.616 1.616-0.724 1.616-1.616 1.616c0 0 0 0-0 0v0c-0.893-0.001-1.616-0.724-1.616-1.617v-0zM19.117 21c-0-1.721-1.396-3.116-3.117-3.116s-3.117 1.395-3.117 3.117c0 1.721 1.395 3.116 3.116 3.117h0c1.721-0.002 3.115-1.396 3.117-3.117v-0zM14.384 21c0-0.893 0.724-1.616 1.617-1.616s1.617 0.724 1.617 1.617-0.724 1.617-1.617 1.617c-0 0-0 0-0.001 0h0c-0.893-0.001-1.616-0.724-1.616-1.617v-0zM28.492 21c-0.001-1.721-1.396-3.115-3.116-3.115s-3.116 1.395-3.116 3.116 1.395 3.116 3.116 3.116c0 0 0.001 0 0.001 0h-0c1.72-0.003 3.113-1.397 3.115-3.117v-0zM23.76 21c0.001-0.892 0.724-1.615 1.616-1.615s1.616 0.724 1.616 1.616c0 0.892-0.723 1.616-1.615 1.616h-0c-0.893-0-1.617-0.724-1.617-1.617v-0zM25.377 25.531c-1.979 0.011-3.71 1.061-4.675 2.633l-0.014 0.024c-0.972-1.603-2.707-2.657-4.688-2.657s-3.717 1.055-4.675 2.633l-0.014 0.024c-0.974-1.603-2.711-2.657-4.695-2.657-2.611 0-4.794 1.827-5.343 4.272l-0.007 0.037c-0.011 0.048-0.017 0.103-0.017 0.16 0 0.414 0.336 0.75 0.75 0.75 0.357 0 0.656-0.25 0.731-0.585l0.001-0.005c0.406-1.803 1.994-3.129 3.891-3.129s3.485 1.326 3.886 3.102l0.005 0.027c0.076 0.339 0.375 0.589 0.731 0.59h0c0.021 0 0.044-0.005 0.065-0.007 0.022 0.002 0.044 0.007 0.065 0.007 0 0 0 0 0 0 0.357 0 0.656-0.25 0.73-0.585l0.001-0.005c0.406-1.803 1.994-3.129 3.891-3.129s3.485 1.326 3.886 3.102l0.005 0.027c0.115 0.337 0.428 0.574 0.797 0.574s0.682-0.238 0.795-0.568l0.002-0.006c0.407-1.803 1.994-3.129 3.892-3.129s3.485 1.326 3.887 3.102l0.005 0.027c0.076 0.34 0.374 0.59 0.732 0.59 0 0 0.001 0 0.001 0h-0c0.057-0 0.112-0.007 0.165-0.019l-0.005 0.001c0.34-0.076 0.59-0.375 0.59-0.733 0-0.057-0.006-0.112-0.018-0.165l0.001 0.005c-0.568-2.476-2.747-4.297-5.354-4.309h-0.001zM30 1.25h-28c-0.414 0-0.75 0.336-0.75 0.75v0 14c0 0.414 0.336 0.75 0.75 0.75s0.75-0.336 0.75-0.75v0-13.25h26.5v13.25c0 0.414 0.336 0.75 0.75 0.75s0.75-0.336 0.75-0.75v0-14c-0-0.414-0.336-0.75-0.75-0.75v0z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">Topic-wise Quizzes</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Layer_1" viewBox="0 0 512.001 512.001" xml:space="preserve" stroke="#0634A1" stroke-width="7.168014000000001"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <g> <path d="M478.329,183.82H300.803c-7.9-27.511-23.412-52.593-45.133-72.042c-32.922-29.481-75.446-43.016-119.749-38.119 C64.871,81.518,8.048,138.871,0.809,210.032c-3.953,38.846,6.67,77.251,29.909,108.14c22.271,29.6,54.229,50.063,90.203,57.816 l37.845,37.844c3.177,3.178,7.395,4.861,11.698,4.86c2.138,0,4.296-0.416,6.358-1.27c6.214-2.574,10.227-8.582,10.227-15.307 V375.62c6.223-1.391,12.285-3.155,18.172-5.257v1.05c0,18.566,15.105,33.671,33.671,33.671h56.539l30.119,30.119 c2.694,2.694,6.269,4.121,9.916,4.121c1.812,0,3.641-0.353,5.389-1.076c5.267-2.182,8.67-7.275,8.67-12.976v-20.188H478.33 c18.566,0,33.671-15.105,33.671-33.671V217.489C512,198.925,496.895,183.82,478.329,183.82z M177.625,361.164 c-3.825,0.682-6.609,4.007-6.609,7.892v33.06c0,0.191,0,0.357-0.33,0.494c-0.33,0.135-0.446,0.019-0.583-0.115l-39.539-39.539 c-1.121-1.121-2.55-1.886-4.106-2.194c-33.084-6.575-62.535-25.124-82.928-52.229c-20.805-27.654-30.313-62.059-26.771-96.878 c3.121-30.685,17.014-59.873,39.119-82.19c22.109-22.32,51.16-36.479,81.805-39.868c5.332-0.59,10.628-0.882,15.885-0.882 c33.893,0,65.884,12.154,91.405,35.007c29.082,26.042,45.761,63.35,45.761,102.359 C290.735,292.663,243.166,349.473,177.625,361.164z M495.966,371.414c0,9.725-7.912,17.637-17.637,17.637H341.508 c-4.427,0-8.017,3.589-8.017,8.017v23.403l-29.071-29.071c-1.503-1.504-3.542-2.348-5.668-2.348h-59.859 c-9.725,0-17.637-7.912-17.637-17.637v-7.818c51.32-25.224,85.513-77.856,85.513-137.515c0-8.852-0.781-17.622-2.28-26.228 h173.841c9.725,0,17.637,7.912,17.637,17.637V371.414z"></path> </g> </g> <g> <g> <path d="M449.792,246.027c-3.13-3.131-8.206-3.131-11.337,0l-79.845,79.845l-37.069-37.069c-3.131-3.131-8.207-3.131-11.337,0 c-3.131,3.131-3.131,8.207,0,11.337l42.737,42.737c1.565,1.565,3.617,2.348,5.668,2.348c2.051,0,4.104-0.782,5.669-2.348 l85.513-85.513C452.923,254.233,452.923,249.157,449.792,246.027z"></path> </g> </g> <g> <g> <path d="M153.385,286.464c-0.003,0-0.007,0-0.011,0c-4.427,0-8.022,3.595-8.022,8.022c0,0.001,0,0.003,0,0.005 c0,0.002,0,0.003,0,0.005c0,4.427,3.595,8.022,8.022,8.022c0.003,0,0.008,0,0.011,0c4.427,0,8.022-3.595,8.022-8.022 c0-0.001,0-0.003,0-0.005c0-0.002,0-0.003,0-0.005C161.407,290.059,157.812,286.464,153.385,286.464z"></path> </g> </g> <g> <g> <path d="M189.094,164.713c-9.712-9.712-22.397-15.06-35.719-15.059c-27.994,0.002-50.769,22.78-50.769,50.773 c0,4.427,3.589,8.017,8.017,8.017c4.427,0,8.017-3.589,8.017-8.017c0-19.154,15.583-34.739,34.737-34.74 c9.039,0,17.697,3.679,24.38,10.362c6.683,6.683,10.363,15.342,10.363,24.381c-0.001,15.227-10.176,28.911-24.742,33.279 c-10.776,3.231-18.014,12.886-18.014,24.024v2.554c0,4.427,3.589,8.017,8.017,8.017c4.427,0,8.017-3.589,8.017-8.017v-2.554 c0-4.002,2.647-7.485,6.587-8.666c21.295-6.386,36.169-26.385,36.17-48.636C204.154,187.11,198.806,174.424,189.094,164.713z"></path> </g> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">Case Studies</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 24 24"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><g id="Repeat"><path d="M2.078,17.562c-0.01,-0.039 -0.016,-0.08 -0.016,-0.123c0,-0.138 0.056,-0.263 0.147,-0.353c0.008,-0.009 1.416,-1.417 2,-2c0.198,-0.198 0.507,-0.183 0.707,-0c0.199,0.183 0.185,0.522 -0,0.707l-1.147,1.146l15.669,0c0.828,0 1.5,-0.671 1.5,-1.5l0,-3.439c0,-0.276 0.224,-0.5 0.5,-0.5c0.276,0 0.5,0.224 0.5,0.5l0,3.439c0,1.381 -1.12,2.5 -2.5,2.5l-15.669,0l1.147,1.147c0.198,0.198 0.183,0.507 -0,0.707c-0.183,0.199 -0.522,0.185 -0.707,-0l-2,-2c-0.066,-0.063 -0.11,-0.143 -0.131,-0.231Zm19.845,-11.105c0.01,0.039 0.015,0.08 0.015,0.122c0,0.138 -0.056,0.263 -0.147,0.354c-0.008,0.008 -1.416,1.417 -2,2c-0.197,0.198 -0.507,0.183 -0.707,-0c-0.199,-0.183 -0.185,-0.522 0,-0.707l1.147,-1.147l-15.669,0c-0.828,0 -1.5,0.672 -1.5,1.5l0,3.439c-0,0.276 -0.224,0.5 -0.5,0.5c-0.276,0 -0.5,-0.224 -0.5,-0.5l0,-3.439c0,-1.381 1.12,-2.5 2.5,-2.5l15.669,0l-1.146,-1.146c-0.198,-0.198 -0.183,-0.507 -0,-0.707c0.183,-0.199 0.522,-0.185 0.707,-0l2,2c0.065,0.063 0.11,0.143 0.131,0.231Z"></path></g></g></svg>						</span>
										<span class="elementor-icon-list-text"> Access to Global Peer Community</span>
									</li>
						</ul>
						</div>
				</div>
		<div class="elementor-element elementor-element-a3a97ee e-con-full e-flex e-con e-child" data-id="a3a97ee" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-e6398d7 elementor-widget__width-initial elementor-widget elementor-widget-heading" data-id="e6398d7" data-element_type="widget" data-e-type="widget" data-widget_type="heading.default">
				<div class="elementor-widget-container">
					<h2 class="elementor-heading-title elementor-size-default"><p><span style="font-size: 13px;color: black">Buy for </span><span style="font-size: 16px;color: #63b7fd;font-weight: bold">52% OFF</span><br />
<span style="font-size: 13px;color: gray;text-decoration: line-through">₹25,000.00</span><span style="font-size: 17px;color: black;font-weight: bold"> ₹11,999.00</span></p>
</h2>				</div>
				</div>
				<div class="elementor-element elementor-element-856e4c2 elementor-mobile-align-right elementor-widget-mobile__width-initial elementor-widget elementor-widget-button" data-id="856e4c2" data-element_type="widget" data-e-type="widget" data-widget_type="button.default">
				<div class="elementor-widget-container">
									<div class="elementor-button-wrapper">
					<a class="elementor-button elementor-button-link elementor-size-sm" href="https://getsdeready.com/courses/design-dsa-combined/">
						<span class="elementor-button-content-wrapper">
									<span class="elementor-button-text">Learn More</span>
					</span>
					</a>
				</div>
								</div>
				</div>
				</div>
					</div>
				</div>
				</div>
				</div>
		
						</div>
				</div>
				<div class="elementor-element elementor-element-69f782b elementor-align-justify elementor-widget elementor-widget-button" data-id="69f782b" data-element_type="widget" data-e-type="widget" data-widget_type="button.default">
				<div class="elementor-widget-container">
									<div class="elementor-button-wrapper">
					<a class="elementor-button elementor-button-link elementor-size-sm" href="https://wa.me/919773728034?text=Hello%20GET%20SDE%20READY" target="_blank" rel="noopener">
						<span class="elementor-button-content-wrapper">
									<span class="elementor-button-text">Got Confusion ?</span>
					</span>
					</a>
				</div>
								</div>
				</div>
				</div>
				</div>
				</div>
		<div class="elementor-element elementor-element-1cc875ae e-flex e-con-boxed e-con e-parent" data-id="1cc875ae" data-element_type="container" data-e-type="container" data-settings="{&quot;background_background&quot;:&quot;classic&quot;}">
					<div class="e-con-inner">
				<div class="elementor-element elementor-element-3efe205a elementor-widget elementor-widget-heading" data-id="3efe205a" data-element_type="widget" data-e-type="widget" data-widget_type="heading.default">
				<div class="elementor-widget-container">
					<h3 class="elementor-heading-title elementor-size-default">Accelerate your Path to a Product based Career</h3>				</div>
				</div>
				<div class="elementor-element elementor-element-2917e979 elementor-hidden-mobile elementor-widget elementor-widget-text-editor" data-id="2917e979" data-element_type="widget" data-e-type="widget" data-widget_type="text-editor.default">
				<div class="elementor-widget-container">
									<p><span style="color: #57586e; font-family: Inter, sans-serif; font-size: 18px;">Boost your career or get hired at top product-based companies by joining our expertly crafted courses. Gain practical skills and real-world knowledge to help you succeed.</span></p>								</div>
				</div>
				<div class="elementor-element elementor-element-4406644 elementor-pagination-type-bullets elementor-pagination-position-outside elementor-widget elementor-widget-loop-carousel" data-id="4406644" data-element_type="widget" data-e-type="widget" data-settings="{&quot;template_id&quot;:&quot;30707&quot;,&quot;_skin&quot;:&quot;post&quot;,&quot;slides_to_show&quot;:&quot;3&quot;,&quot;slides_to_show_tablet&quot;:&quot;2&quot;,&quot;slides_to_show_mobile&quot;:&quot;1&quot;,&quot;slides_to_scroll&quot;:&quot;1&quot;,&quot;edit_handle_selector&quot;:&quot;.elementor-loop-container&quot;,&quot;autoplay&quot;:&quot;yes&quot;,&quot;autoplay_speed&quot;:5000,&quot;pause_on_hover&quot;:&quot;yes&quot;,&quot;pause_on_interaction&quot;:&quot;yes&quot;,&quot;infinite&quot;:&quot;yes&quot;,&quot;speed&quot;:500,&quot;offset_sides&quot;:&quot;none&quot;,&quot;pagination&quot;:&quot;bullets&quot;,&quot;image_spacing_custom&quot;:{&quot;unit&quot;:&quot;px&quot;,&quot;size&quot;:10,&quot;sizes&quot;:[]},&quot;image_spacing_custom_tablet&quot;:{&quot;unit&quot;:&quot;px&quot;,&quot;size&quot;:&quot;&quot;,&quot;sizes&quot;:[]},&quot;image_spacing_custom_mobile&quot;:{&quot;unit&quot;:&quot;px&quot;,&quot;size&quot;:&quot;&quot;,&quot;sizes&quot;:[]}}" data-widget_type="loop-carousel.post">
				<div class="elementor-widget-container">
							<div class="swiper elementor-loop-container elementor-grid" role="list" dir="ltr">
				<div class="swiper-wrapper" aria-live="off">
				<div data-elementor-type="loop-item" data-elementor-id="30707" class="elementor elementor-30707 swiper-slide e-loop-item e-loop-item-48008 post-48008 courses type-courses status-publish has-post-thumbnail hentry course-category-featured course-tag-algorithms course-tag-data-structures course-tag-high-level-system-design course-tag-low-level-system-design course-tag-programming course-tag-systemdesign" data-elementor-post-type="elementor_library" role="group" aria-roledescription="slide" data-custom-edit-handle="1">
			<div class="elementor-element elementor-element-3bfce03 e-flex e-con-boxed e-con e-parent" data-id="3bfce03" data-element_type="container" data-e-type="container" data-settings="{&quot;background_background&quot;:&quot;classic&quot;}">
					<div class="e-con-inner">
				<div class="elementor-element elementor-element-62ff770 elementor-widget elementor-widget-theme-post-featured-image elementor-widget-image" data-id="62ff770" data-element_type="widget" data-e-type="widget" data-widget_type="theme-post-featured-image.default">
				<div class="elementor-widget-container">
															<img loading="lazy" decoding="async" width="1600" height="1125" src="https://getsdeready.com/wp-content/uploads/2025/10/WhatsApp-Image-2025-10-26-at-15.21.27_a96fe388.webp" class="attachment-full size-full wp-image-49216" alt="" srcset="https://getsdeready.com/wp-content/uploads/2025/10/WhatsApp-Image-2025-10-26-at-15.21.27_a96fe388.webp 1600w, https://getsdeready.com/wp-content/uploads/2025/10/WhatsApp-Image-2025-10-26-at-15.21.27_a96fe388-300x211.webp 300w, https://getsdeready.com/wp-content/uploads/2025/10/WhatsApp-Image-2025-10-26-at-15.21.27_a96fe388-1024x720.webp 1024w, https://getsdeready.com/wp-content/uploads/2025/10/WhatsApp-Image-2025-10-26-at-15.21.27_a96fe388-768x540.webp 768w, https://getsdeready.com/wp-content/uploads/2025/10/WhatsApp-Image-2025-10-26-at-15.21.27_a96fe388-1536x1080.webp 1536w, https://getsdeready.com/wp-content/uploads/2025/10/WhatsApp-Image-2025-10-26-at-15.21.27_a96fe388-50x35.webp 50w, https://getsdeready.com/wp-content/uploads/2025/10/WhatsApp-Image-2025-10-26-at-15.21.27_a96fe388-100x70.webp 100w, https://getsdeready.com/wp-content/uploads/2025/10/WhatsApp-Image-2025-10-26-at-15.21.27_a96fe388-600x422.webp 600w, https://getsdeready.com/wp-content/uploads/2025/10/WhatsApp-Image-2025-10-26-at-15.21.27_a96fe388-71x50.webp 71w" sizes="(max-width: 1600px) 100vw, 1600px" />															</div>
				</div>
				<div class="elementor-element elementor-element-fb51e5c elementor-widget elementor-widget-heading" data-id="fb51e5c" data-element_type="widget" data-e-type="widget" data-widget_type="heading.default">
				<div class="elementor-widget-container">
					<h2 class="elementor-heading-title elementor-size-default">SDE 360: Master DSA, System Design, AI &#038; Behavioural</h2>				</div>
				</div>
				<div class="elementor-element elementor-element-716c418 elementor-icon-list--layout-traditional elementor-list-item-link-full_width elementor-widget elementor-widget-icon-list" data-id="716c418" data-element_type="widget" data-e-type="widget" data-widget_type="icon-list.default">
				<div class="elementor-widget-container">
							<ul class="elementor-icon-list-items">
							<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><title>video-camera</title><path d="M30.395 6.362c-0.112-0.071-0.248-0.113-0.395-0.113-0.122 0-0.238 0.030-0.34 0.082l0.004-0.002-6.938 3.468c-0.106-1.426-1.287-2.543-2.729-2.548h-15.996c-1.518 0.002-2.748 1.232-2.75 2.75v12.001c0.002 1.518 1.232 2.748 2.75 2.75h15.996c1.443-0.005 2.623-1.122 2.729-2.538l0.001-0.009 6.939 3.468c0.097 0.050 0.211 0.080 0.333 0.080 0.001 0 0.002 0 0.003 0h-0c0.001 0 0.001 0 0.002 0 0.413 0 0.748-0.335 0.748-0.748 0-0.001 0-0.001 0-0.002v0-18c-0-0.268-0.141-0.503-0.352-0.636l-0.003-0.002zM21.246 22c-0.001 0.69-0.56 1.249-1.25 1.25h-15.996c-0.69-0.001-1.249-0.56-1.25-1.25v-12.001c0.001-0.69 0.56-1.249 1.25-1.25h15.996c0.69 0.001 1.249 0.56 1.25 1.25v12.001zM29.25 23.787l-6.504-3.25v-9.073l6.504-3.251z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">100+ Live Classes &amp; Recordings</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32" data-name="Layer 1" id="Layer_1" stroke="#0634A1" stroke-width="0.16"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><path d="M18,6V7H17a1,1,0,0,1-1-1V4h1V6Z"></path><path d="M17,6V7h1a1,1,0,0,0,1-1V4H18V6Z"></path><path d="M18,2V1H17a1,1,0,0,0-1,1V3h1V2Z"></path><path d="M17,2V1h1a1,1,0,0,1,1,1V4H18V2Z"></path><rect height="1" transform="translate(27 53) rotate(180)" width="19" x="4" y="26"></rect><rect height="1" transform="translate(32 59) rotate(180)" width="18" x="7" y="29"></rect><rect height="1" transform="translate(42 -13) rotate(90)" width="21" x="17" y="14"></rect><rect height="1" transform="translate(22.5 7.5) rotate(90)" width="22" x="-3.5" y="14.5"></rect><path d="M28,25H27v2a2,2,0,0,1-2,2h0v1h0a3,3,0,0,0,3-3Z"></path><path d="M22,26h1v1a2,2,0,0,0,2,2h0v1h0a3,3,0,0,1-3-3Z"></path><path d="M4,26H5v1a2,2,0,0,0,2,2H8v1H7a3,3,0,0,1-3-3Z"></path><rect height="1" width="17" x="9" y="2"></rect><path d="M25,2V3h1a1,1,0,0,1,1,1V5h1V4a2,2,0,0,0-2-2Z"></path><path d="M10,2V3H9A1,1,0,0,0,8,4V5H7V4A2,2,0,0,1,9,2Z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">24*7 Live Doubt Support</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Capa_1" viewBox="0 0 442 442" xml:space="preserve"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <path d="M179.046,93.365h84.845c2.761,0,5-2.239,5-5s-2.239-5-5-5h-84.845c-2.761,0-5,2.239-5,5S176.285,93.365,179.046,93.365z"></path> <path d="M122.977,120.046H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,120.046,122.977,120.046z "></path> <path d="M122.977,146.728H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,146.728,122.977,146.728z "></path> <path d="M122.977,173.409H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,173.409,122.977,173.409z "></path> <path d="M122.977,200.091H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,200.091,122.977,200.091z "></path> <path d="M122.977,226.772H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,226.772,122.977,226.772z "></path> <path d="M122.977,253.454H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,253.454,122.977,253.454z "></path> <path d="M122.977,280.135H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,280.135,122.977,280.135z "></path> <path d="M122.977,306.816H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,306.816,122.977,306.816z "></path> <path d="M232.008,323.498H122.977c-2.761,0-5,2.239-5,5s2.239,5,5,5h109.031c2.761,0,5-2.239,5-5S234.769,323.498,232.008,323.498z "></path> <path d="M385.536,68.464l-67-67C317.598,0.527,316.326,0,315,0H60c-2.761,0-5,2.239-5,5v432c0,2.761,2.239,5,5,5h322 c2.761,0,5-2.239,5-5V72C387,70.674,386.473,69.402,385.536,68.464z M320,17.071L369.929,67H320V17.071z M65,432V10h245v62 c0,2.761,2.239,5,5,5h62v355H65z"></path> <path d="M329.39,357.142c-0.717-1.979-2.596-3.298-4.702-3.298s-3.985,1.319-4.702,3.298l-15.366,42.453 c-0.939,2.597,0.403,5.463,3,6.403c0.562,0.203,1.136,0.3,1.701,0.3c2.046,0,3.966-1.265,4.702-3.3l4.001-11.055h13.326 l4.001,11.055c0.94,2.596,3.805,3.938,6.403,3c2.597-0.94,3.939-3.807,3-6.403L329.39,357.142z M321.645,381.943l3.043-8.409 l3.044,8.409H321.645z"></path> <path d="M342.466,304.771l-83.996,83.996c-1.953,1.953-1.953,5.119,0,7.071c0.977,0.976,2.256,1.464,3.536,1.464 s2.559-0.488,3.536-1.464l83.996-83.996c1.953-1.953,1.953-5.119,0-7.071C347.584,302.819,344.419,302.819,342.466,304.771z"></path> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">400+ DSA Practice Questions</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 24 24"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><path d="M20,6.52797748 L20,19.5 C20,20.8807119 18.8807119,22 17.5,22 L6.5,22 C5.11928813,22 4,20.8807119 4,19.5 L4,4.5 C4,3.11928813 5.11928813,2 6.5,2 L15.4720225,2 C15.6047688,1.99158053 15.7429463,2.03583949 15.8535534,2.14644661 L19.8535534,6.14644661 C19.9641605,6.25705373 20.0084195,6.39523125 20,6.52797748 Z M15,3 L6.5,3 C5.67157288,3 5,3.67157288 5,4.5 L5,19.5 C5,20.3284271 5.67157288,21 6.5,21 L17.5,21 C18.3284271,21 19,20.3284271 19,19.5 L19,7 L15.5,7 C15.2238576,7 15,6.77614237 15,6.5 L15,3 Z M16,3.70710678 L16,6 L18.2928932,6 L16,3.70710678 Z M12,16.2928932 L14.1464466,14.1464466 C14.3417088,13.9511845 14.6582912,13.9511845 14.8535534,14.1464466 C15.0488155,14.3417088 15.0488155,14.6582912 14.8535534,14.8535534 L11.9198269,17.7872799 C11.8307203,17.9246987 11.6759769,18.0156098 11.5,18.0156098 C11.3240231,18.0156098 11.1692797,17.9246987 11.0801731,17.7872799 L8.14644661,14.8535534 C7.95118446,14.6582912 7.95118446,14.3417088 8.14644661,14.1464466 C8.34170876,13.9511845 8.65829124,13.9511845 8.85355339,14.1464466 L11,16.2928932 L11,9.5 C11,9.22385763 11.2238576,9 11.5,9 C11.7761424,9 12,9.22385763 12,9.5 L12,16.2928932 L12,16.2928932 Z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">Comprehensive Notes</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Capa_1" viewBox="0 0 394.497 394.497" xml:space="preserve"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <path d="M181.239,84.373c-30.412,30.413-30.412,79.896,0,110.309c15.206,15.206,35.18,22.809,55.154,22.809 s39.948-7.603,55.154-22.809c30.412-30.413,30.412-79.896,0-110.309C261.136,53.961,211.651,53.961,181.239,84.373z M295,174.026 v-68.998C307.48,126.239,307.48,152.817,295,174.026z M285,91.994v95.067c-0.177,0.181-0.343,0.37-0.522,0.55 c-26.514,26.512-69.652,26.514-96.168,0c-3.953-3.953-7.302-8.281-10.076-12.862H184c2.762,0,5-2.239,5-5s-2.238-5-5-5h-10.747 c-3.926-9.869-5.447-20.475-4.576-30.92H208c2.762,0,5-2.239,5-5s-2.238-5-5-5h-37.742c2.653-11.26,8.213-21.961,16.66-30.92H251 c2.762,0,5-2.239,5-5s-2.238-5-5-5h-52.269c11.361-7.562,24.51-11.349,37.662-11.349c17.413,0,34.827,6.628,48.084,19.885 C284.657,91.624,284.823,91.813,285,91.994z"></path> <path d="M389.225,266.902l-72.44-72.44c11.022-16.057,16.958-35.038,16.958-54.935c0-26.002-10.127-50.449-28.514-68.835 c-7.583-7.583-16.125-13.624-25.229-18.177V7.749c0-2.761-2.238-5-5-5H55.69c-1.326,0-2.598,0.527-3.535,1.464l-50.69,50.68 C0.527,55.831,0,57.103,0,58.429v328.32c0,2.761,2.238,5,5,5h270c2.762,0,5-2.239,5-5V226.54c3.882-1.941,7.658-4.157,11.303-6.649 l72.467,72.467c3.509,3.509,8.117,5.264,12.728,5.264c4.608,0,9.219-1.755,12.728-5.264c3.4-3.399,5.272-7.92,5.272-12.728 C394.497,274.822,392.625,270.302,389.225,266.902z M323.742,139.527c0,23.332-9.086,45.267-25.584,61.764 c-34.059,34.058-89.471,34.057-123.529,0c-16.498-16.498-25.584-38.433-25.584-61.764s9.086-45.267,25.584-61.764 c17.029-17.028,39.396-25.542,61.765-25.542s44.735,8.514,61.765,25.542C314.656,94.261,323.742,116.196,323.742,139.527z M50.69,19.817v33.611H17.073L50.69,19.817z M270,381.749H10V63.429h45.69c2.762,0,5-2.239,5-5v-45.68H270v35.448 c-34.511-12.638-74.79-5.156-102.441,22.496c-6.161,6.161-11.389,13.005-15.625,20.357h-46.932c-2.762,0-5,2.239-5,5s2.238,5,5,5 h41.922c-2.822,6.557-4.91,13.424-6.224,20.5H48.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h90.871c-0.213,2.64-0.326,5.301-0.326,7.979 c0,4.222,0.271,8.401,0.797,12.521H93c-2.762,0-5,2.239-5,5s2.238,5,5,5h48.656c1.676,7.109,4.145,13.978,7.364,20.5H48.5 c-2.762,0-5,2.239-5,5s2.238,5,5,5h106.222c3.678,5.64,7.964,10.941,12.836,15.814c1.642,1.642,3.343,3.186,5.07,4.686H155.5 c-2.762,0-5,2.239-5,5s2.238,5,5,5h30.89c15.335,9.179,32.667,13.781,50.004,13.781c11.394,0,22.781-2.006,33.606-5.971V381.749z M305.229,208.363c1.899-1.899,3.705-3.866,5.426-5.89l51.275,51.275l-11.314,11.314l-51.295-51.295 C301.341,212.053,303.322,210.269,305.229,208.363z M382.154,285.287c-3.119,3.119-8.195,3.119-11.314,0l-13.154-13.154 L369,260.819l13.154,13.154c1.511,1.511,2.343,3.52,2.343,5.657S383.665,283.776,382.154,285.287z"></path> <path d="M48.5,101.049h40.001c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,101.049,48.5,101.049z"></path> <path d="M48.5,162.049h27.501c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,162.049,48.5,162.049z"></path> <path d="M48.5,223.049h92.301c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,223.049,48.5,223.049z"></path> <path d="M231.5,243.549H86.501c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,243.549,231.5,243.549z"></path> <path d="M48.5,253.549h22.001c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,253.549,48.5,253.549z"></path> <path d="M231.5,304.549h-94.499c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,304.549,231.5,304.549z"></path> <path d="M48.5,314.549h72.801c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,314.549,48.5,314.549z"></path> <path d="M231.5,335.049H178c-2.762,0-5,2.239-5,5s2.238,5,5,5h53.5c2.762,0,5-2.239,5-5S234.262,335.049,231.5,335.049z"></path> <path d="M163.101,335.049h-89.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h89.5c2.762,0,5-2.239,5-5S165.862,335.049,163.101,335.049z"></path> <path d="M58.501,335.049H48.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h10.001c2.762,0,5-2.239,5-5S61.263,335.049,58.501,335.049z"></path> <path d="M231.5,274.049h-30.499c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,274.049,231.5,274.049z"></path> <path d="M48.5,284.049h135c2.762,0,5-2.239,5-5s-2.238-5-5-5h-135c-2.762,0-5,2.239-5,5S45.738,284.049,48.5,284.049z"></path> <path d="M251,123.829h-17.5c-2.762,0-5,2.239-5,5s2.238,5,5,5H251c2.762,0,5-2.239,5-5S253.762,123.829,251,123.829z"></path> <path d="M251,164.749h-46c-2.762,0-5,2.239-5,5s2.238,5,5,5h46c2.762,0,5-2.239,5-5S253.762,164.749,251,164.749z"></path> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">HackerRank Tests &amp; Quizzes</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><title>screen-users</title><path d="M9.74 21c-0.001-1.721-1.396-3.115-3.116-3.115s-3.116 1.395-3.116 3.116 1.395 3.116 3.116 3.116v0c1.721-0.002 3.115-1.397 3.116-3.117v-0zM5.008 21c0.001-0.892 0.724-1.615 1.616-1.615s1.616 0.724 1.616 1.616-0.724 1.616-1.616 1.616c0 0 0 0-0 0v0c-0.893-0.001-1.616-0.724-1.616-1.617v-0zM19.117 21c-0-1.721-1.396-3.116-3.117-3.116s-3.117 1.395-3.117 3.117c0 1.721 1.395 3.116 3.116 3.117h0c1.721-0.002 3.115-1.396 3.117-3.117v-0zM14.384 21c0-0.893 0.724-1.616 1.617-1.616s1.617 0.724 1.617 1.617-0.724 1.617-1.617 1.617c-0 0-0 0-0.001 0h0c-0.893-0.001-1.616-0.724-1.616-1.617v-0zM28.492 21c-0.001-1.721-1.396-3.115-3.116-3.115s-3.116 1.395-3.116 3.116 1.395 3.116 3.116 3.116c0 0 0.001 0 0.001 0h-0c1.72-0.003 3.113-1.397 3.115-3.117v-0zM23.76 21c0.001-0.892 0.724-1.615 1.616-1.615s1.616 0.724 1.616 1.616c0 0.892-0.723 1.616-1.615 1.616h-0c-0.893-0-1.617-0.724-1.617-1.617v-0zM25.377 25.531c-1.979 0.011-3.71 1.061-4.675 2.633l-0.014 0.024c-0.972-1.603-2.707-2.657-4.688-2.657s-3.717 1.055-4.675 2.633l-0.014 0.024c-0.974-1.603-2.711-2.657-4.695-2.657-2.611 0-4.794 1.827-5.343 4.272l-0.007 0.037c-0.011 0.048-0.017 0.103-0.017 0.16 0 0.414 0.336 0.75 0.75 0.75 0.357 0 0.656-0.25 0.731-0.585l0.001-0.005c0.406-1.803 1.994-3.129 3.891-3.129s3.485 1.326 3.886 3.102l0.005 0.027c0.076 0.339 0.375 0.589 0.731 0.59h0c0.021 0 0.044-0.005 0.065-0.007 0.022 0.002 0.044 0.007 0.065 0.007 0 0 0 0 0 0 0.357 0 0.656-0.25 0.73-0.585l0.001-0.005c0.406-1.803 1.994-3.129 3.891-3.129s3.485 1.326 3.886 3.102l0.005 0.027c0.115 0.337 0.428 0.574 0.797 0.574s0.682-0.238 0.795-0.568l0.002-0.006c0.407-1.803 1.994-3.129 3.892-3.129s3.485 1.326 3.887 3.102l0.005 0.027c0.076 0.34 0.374 0.59 0.732 0.59 0 0 0.001 0 0.001 0h-0c0.057-0 0.112-0.007 0.165-0.019l-0.005 0.001c0.34-0.076 0.59-0.375 0.59-0.733 0-0.057-0.006-0.112-0.018-0.165l0.001 0.005c-0.568-2.476-2.747-4.297-5.354-4.309h-0.001zM30 1.25h-28c-0.414 0-0.75 0.336-0.75 0.75v0 14c0 0.414 0.336 0.75 0.75 0.75s0.75-0.336 0.75-0.75v0-13.25h26.5v13.25c0 0.414 0.336 0.75 0.75 0.75s0.75-0.336 0.75-0.75v0-14c-0-0.414-0.336-0.75-0.75-0.75v0z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">Topic-wise Quizzes</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Layer_1" viewBox="0 0 512.001 512.001" xml:space="preserve" stroke="#0634A1" stroke-width="7.168014000000001"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <g> <path d="M478.329,183.82H300.803c-7.9-27.511-23.412-52.593-45.133-72.042c-32.922-29.481-75.446-43.016-119.749-38.119 C64.871,81.518,8.048,138.871,0.809,210.032c-3.953,38.846,6.67,77.251,29.909,108.14c22.271,29.6,54.229,50.063,90.203,57.816 l37.845,37.844c3.177,3.178,7.395,4.861,11.698,4.86c2.138,0,4.296-0.416,6.358-1.27c6.214-2.574,10.227-8.582,10.227-15.307 V375.62c6.223-1.391,12.285-3.155,18.172-5.257v1.05c0,18.566,15.105,33.671,33.671,33.671h56.539l30.119,30.119 c2.694,2.694,6.269,4.121,9.916,4.121c1.812,0,3.641-0.353,5.389-1.076c5.267-2.182,8.67-7.275,8.67-12.976v-20.188H478.33 c18.566,0,33.671-15.105,33.671-33.671V217.489C512,198.925,496.895,183.82,478.329,183.82z M177.625,361.164 c-3.825,0.682-6.609,4.007-6.609,7.892v33.06c0,0.191,0,0.357-0.33,0.494c-0.33,0.135-0.446,0.019-0.583-0.115l-39.539-39.539 c-1.121-1.121-2.55-1.886-4.106-2.194c-33.084-6.575-62.535-25.124-82.928-52.229c-20.805-27.654-30.313-62.059-26.771-96.878 c3.121-30.685,17.014-59.873,39.119-82.19c22.109-22.32,51.16-36.479,81.805-39.868c5.332-0.59,10.628-0.882,15.885-0.882 c33.893,0,65.884,12.154,91.405,35.007c29.082,26.042,45.761,63.35,45.761,102.359 C290.735,292.663,243.166,349.473,177.625,361.164z M495.966,371.414c0,9.725-7.912,17.637-17.637,17.637H341.508 c-4.427,0-8.017,3.589-8.017,8.017v23.403l-29.071-29.071c-1.503-1.504-3.542-2.348-5.668-2.348h-59.859 c-9.725,0-17.637-7.912-17.637-17.637v-7.818c51.32-25.224,85.513-77.856,85.513-137.515c0-8.852-0.781-17.622-2.28-26.228 h173.841c9.725,0,17.637,7.912,17.637,17.637V371.414z"></path> </g> </g> <g> <g> <path d="M449.792,246.027c-3.13-3.131-8.206-3.131-11.337,0l-79.845,79.845l-37.069-37.069c-3.131-3.131-8.207-3.131-11.337,0 c-3.131,3.131-3.131,8.207,0,11.337l42.737,42.737c1.565,1.565,3.617,2.348,5.668,2.348c2.051,0,4.104-0.782,5.669-2.348 l85.513-85.513C452.923,254.233,452.923,249.157,449.792,246.027z"></path> </g> </g> <g> <g> <path d="M153.385,286.464c-0.003,0-0.007,0-0.011,0c-4.427,0-8.022,3.595-8.022,8.022c0,0.001,0,0.003,0,0.005 c0,0.002,0,0.003,0,0.005c0,4.427,3.595,8.022,8.022,8.022c0.003,0,0.008,0,0.011,0c4.427,0,8.022-3.595,8.022-8.022 c0-0.001,0-0.003,0-0.005c0-0.002,0-0.003,0-0.005C161.407,290.059,157.812,286.464,153.385,286.464z"></path> </g> </g> <g> <g> <path d="M189.094,164.713c-9.712-9.712-22.397-15.06-35.719-15.059c-27.994,0.002-50.769,22.78-50.769,50.773 c0,4.427,3.589,8.017,8.017,8.017c4.427,0,8.017-3.589,8.017-8.017c0-19.154,15.583-34.739,34.737-34.74 c9.039,0,17.697,3.679,24.38,10.362c6.683,6.683,10.363,15.342,10.363,24.381c-0.001,15.227-10.176,28.911-24.742,33.279 c-10.776,3.231-18.014,12.886-18.014,24.024v2.554c0,4.427,3.589,8.017,8.017,8.017c4.427,0,8.017-3.589,8.017-8.017v-2.554 c0-4.002,2.647-7.485,6.587-8.666c21.295-6.386,36.169-26.385,36.17-48.636C204.154,187.11,198.806,174.424,189.094,164.713z"></path> </g> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">Case Studies</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 24 24"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><g id="Repeat"><path d="M2.078,17.562c-0.01,-0.039 -0.016,-0.08 -0.016,-0.123c0,-0.138 0.056,-0.263 0.147,-0.353c0.008,-0.009 1.416,-1.417 2,-2c0.198,-0.198 0.507,-0.183 0.707,-0c0.199,0.183 0.185,0.522 -0,0.707l-1.147,1.146l15.669,0c0.828,0 1.5,-0.671 1.5,-1.5l0,-3.439c0,-0.276 0.224,-0.5 0.5,-0.5c0.276,0 0.5,0.224 0.5,0.5l0,3.439c0,1.381 -1.12,2.5 -2.5,2.5l-15.669,0l1.147,1.147c0.198,0.198 0.183,0.507 -0,0.707c-0.183,0.199 -0.522,0.185 -0.707,-0l-2,-2c-0.066,-0.063 -0.11,-0.143 -0.131,-0.231Zm19.845,-11.105c0.01,0.039 0.015,0.08 0.015,0.122c0,0.138 -0.056,0.263 -0.147,0.354c-0.008,0.008 -1.416,1.417 -2,2c-0.197,0.198 -0.507,0.183 -0.707,-0c-0.199,-0.183 -0.185,-0.522 0,-0.707l1.147,-1.147l-15.669,0c-0.828,0 -1.5,0.672 -1.5,1.5l0,3.439c-0,0.276 -0.224,0.5 -0.5,0.5c-0.276,0 -0.5,-0.224 -0.5,-0.5l0,-3.439c0,-1.381 1.12,-2.5 2.5,-2.5l15.669,0l-1.146,-1.146c-0.198,-0.198 -0.183,-0.507 -0,-0.707c0.183,-0.199 0.522,-0.185 0.707,-0l2,2c0.065,0.063 0.11,0.143 0.131,0.231Z"></path></g></g></svg>						</span>
										<span class="elementor-icon-list-text"> Access to Global Peer Community</span>
									</li>
						</ul>
						</div>
				</div>
		<div class="elementor-element elementor-element-a3a97ee e-con-full e-flex e-con e-child" data-id="a3a97ee" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-e6398d7 elementor-widget__width-initial elementor-widget elementor-widget-heading" data-id="e6398d7" data-element_type="widget" data-e-type="widget" data-widget_type="heading.default">
				<div class="elementor-widget-container">
					<h2 class="elementor-heading-title elementor-size-default"><p><span style="font-size: 13px;color: black">Buy for </span><span style="font-size: 16px;color: #63b7fd;font-weight: bold">50% OFF</span><br />
<span style="font-size: 13px;color: gray;text-decoration: line-through">₹39,999.00</span><span style="font-size: 17px;color: black;font-weight: bold"> ₹29,999.00</span></p>
</h2>				</div>
				</div>
				<div class="elementor-element elementor-element-856e4c2 elementor-mobile-align-right elementor-widget-mobile__width-initial elementor-widget elementor-widget-button" data-id="856e4c2" data-element_type="widget" data-e-type="widget" data-widget_type="button.default">
				<div class="elementor-widget-container">
									<div class="elementor-button-wrapper">
					<a class="elementor-button elementor-button-link elementor-size-sm" href="https://getsdeready.com/courses/sde-360-master-dsa-system-design-ai-behavioural/">
						<span class="elementor-button-content-wrapper">
									<span class="elementor-button-text">Learn More</span>
					</span>
					</a>
				</div>
								</div>
				</div>
				</div>
					</div>
				</div>
				</div>
				<div data-elementor-type="loop-item" data-elementor-id="30707" class="elementor elementor-30707 swiper-slide e-loop-item e-loop-item-572 post-572 courses type-courses status-publish has-post-thumbnail hentry course-category-featured course-tag-high-level-system-design course-tag-low-level-system-design course-tag-systemdesign" data-elementor-post-type="elementor_library" role="group" aria-roledescription="slide" data-custom-edit-handle="1">
			<div class="elementor-element elementor-element-3bfce03 e-flex e-con-boxed e-con e-parent" data-id="3bfce03" data-element_type="container" data-e-type="container" data-settings="{&quot;background_background&quot;:&quot;classic&quot;}">
					<div class="e-con-inner">
				<div class="elementor-element elementor-element-62ff770 elementor-widget elementor-widget-theme-post-featured-image elementor-widget-image" data-id="62ff770" data-element_type="widget" data-e-type="widget" data-widget_type="theme-post-featured-image.default">
				<div class="elementor-widget-container">
															<img loading="lazy" decoding="async" width="768" height="432" src="https://getsdeready.com/wp-content/uploads/2024/03/9-min.png" class="attachment-full size-full wp-image-13204" alt="" srcset="https://getsdeready.com/wp-content/uploads/2024/03/9-min.png 768w, https://getsdeready.com/wp-content/uploads/2024/03/9-min-300x169.png 300w, https://getsdeready.com/wp-content/uploads/2024/03/9-min-160x90.png 160w, https://getsdeready.com/wp-content/uploads/2024/03/9-min-600x338.png 600w, https://getsdeready.com/wp-content/uploads/2024/03/9-min-89x50.png 89w" sizes="(max-width: 768px) 100vw, 768px" />															</div>
				</div>
				<div class="elementor-element elementor-element-fb51e5c elementor-widget elementor-widget-heading" data-id="fb51e5c" data-element_type="widget" data-e-type="widget" data-widget_type="heading.default">
				<div class="elementor-widget-container">
					<h2 class="elementor-heading-title elementor-size-default">Low &#038; High Level System Design</h2>				</div>
				</div>
				<div class="elementor-element elementor-element-716c418 elementor-icon-list--layout-traditional elementor-list-item-link-full_width elementor-widget elementor-widget-icon-list" data-id="716c418" data-element_type="widget" data-e-type="widget" data-widget_type="icon-list.default">
				<div class="elementor-widget-container">
							<ul class="elementor-icon-list-items">
							<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><title>video-camera</title><path d="M30.395 6.362c-0.112-0.071-0.248-0.113-0.395-0.113-0.122 0-0.238 0.030-0.34 0.082l0.004-0.002-6.938 3.468c-0.106-1.426-1.287-2.543-2.729-2.548h-15.996c-1.518 0.002-2.748 1.232-2.75 2.75v12.001c0.002 1.518 1.232 2.748 2.75 2.75h15.996c1.443-0.005 2.623-1.122 2.729-2.538l0.001-0.009 6.939 3.468c0.097 0.050 0.211 0.080 0.333 0.080 0.001 0 0.002 0 0.003 0h-0c0.001 0 0.001 0 0.002 0 0.413 0 0.748-0.335 0.748-0.748 0-0.001 0-0.001 0-0.002v0-18c-0-0.268-0.141-0.503-0.352-0.636l-0.003-0.002zM21.246 22c-0.001 0.69-0.56 1.249-1.25 1.25h-15.996c-0.69-0.001-1.249-0.56-1.25-1.25v-12.001c0.001-0.69 0.56-1.249 1.25-1.25h15.996c0.69 0.001 1.249 0.56 1.25 1.25v12.001zM29.25 23.787l-6.504-3.25v-9.073l6.504-3.251z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">20+ Live Classes &amp; Recordings</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32" data-name="Layer 1" id="Layer_1" stroke="#0634A1" stroke-width="0.16"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><path d="M18,6V7H17a1,1,0,0,1-1-1V4h1V6Z"></path><path d="M17,6V7h1a1,1,0,0,0,1-1V4H18V6Z"></path><path d="M18,2V1H17a1,1,0,0,0-1,1V3h1V2Z"></path><path d="M17,2V1h1a1,1,0,0,1,1,1V4H18V2Z"></path><rect height="1" transform="translate(27 53) rotate(180)" width="19" x="4" y="26"></rect><rect height="1" transform="translate(32 59) rotate(180)" width="18" x="7" y="29"></rect><rect height="1" transform="translate(42 -13) rotate(90)" width="21" x="17" y="14"></rect><rect height="1" transform="translate(22.5 7.5) rotate(90)" width="22" x="-3.5" y="14.5"></rect><path d="M28,25H27v2a2,2,0,0,1-2,2h0v1h0a3,3,0,0,0,3-3Z"></path><path d="M22,26h1v1a2,2,0,0,0,2,2h0v1h0a3,3,0,0,1-3-3Z"></path><path d="M4,26H5v1a2,2,0,0,0,2,2H8v1H7a3,3,0,0,1-3-3Z"></path><rect height="1" width="17" x="9" y="2"></rect><path d="M25,2V3h1a1,1,0,0,1,1,1V5h1V4a2,2,0,0,0-2-2Z"></path><path d="M10,2V3H9A1,1,0,0,0,8,4V5H7V4A2,2,0,0,1,9,2Z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">24*7 Live Doubt Support</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Capa_1" viewBox="0 0 442 442" xml:space="preserve"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <path d="M179.046,93.365h84.845c2.761,0,5-2.239,5-5s-2.239-5-5-5h-84.845c-2.761,0-5,2.239-5,5S176.285,93.365,179.046,93.365z"></path> <path d="M122.977,120.046H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,120.046,122.977,120.046z "></path> <path d="M122.977,146.728H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,146.728,122.977,146.728z "></path> <path d="M122.977,173.409H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,173.409,122.977,173.409z "></path> <path d="M122.977,200.091H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,200.091,122.977,200.091z "></path> <path d="M122.977,226.772H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,226.772,122.977,226.772z "></path> <path d="M122.977,253.454H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,253.454,122.977,253.454z "></path> <path d="M122.977,280.135H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,280.135,122.977,280.135z "></path> <path d="M122.977,306.816H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,306.816,122.977,306.816z "></path> <path d="M232.008,323.498H122.977c-2.761,0-5,2.239-5,5s2.239,5,5,5h109.031c2.761,0,5-2.239,5-5S234.769,323.498,232.008,323.498z "></path> <path d="M385.536,68.464l-67-67C317.598,0.527,316.326,0,315,0H60c-2.761,0-5,2.239-5,5v432c0,2.761,2.239,5,5,5h322 c2.761,0,5-2.239,5-5V72C387,70.674,386.473,69.402,385.536,68.464z M320,17.071L369.929,67H320V17.071z M65,432V10h245v62 c0,2.761,2.239,5,5,5h62v355H65z"></path> <path d="M329.39,357.142c-0.717-1.979-2.596-3.298-4.702-3.298s-3.985,1.319-4.702,3.298l-15.366,42.453 c-0.939,2.597,0.403,5.463,3,6.403c0.562,0.203,1.136,0.3,1.701,0.3c2.046,0,3.966-1.265,4.702-3.3l4.001-11.055h13.326 l4.001,11.055c0.94,2.596,3.805,3.938,6.403,3c2.597-0.94,3.939-3.807,3-6.403L329.39,357.142z M321.645,381.943l3.043-8.409 l3.044,8.409H321.645z"></path> <path d="M342.466,304.771l-83.996,83.996c-1.953,1.953-1.953,5.119,0,7.071c0.977,0.976,2.256,1.464,3.536,1.464 s2.559-0.488,3.536-1.464l83.996-83.996c1.953-1.953,1.953-5.119,0-7.071C347.584,302.819,344.419,302.819,342.466,304.771z"></path> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">Case Studies</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 24 24"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><path d="M20,6.52797748 L20,19.5 C20,20.8807119 18.8807119,22 17.5,22 L6.5,22 C5.11928813,22 4,20.8807119 4,19.5 L4,4.5 C4,3.11928813 5.11928813,2 6.5,2 L15.4720225,2 C15.6047688,1.99158053 15.7429463,2.03583949 15.8535534,2.14644661 L19.8535534,6.14644661 C19.9641605,6.25705373 20.0084195,6.39523125 20,6.52797748 Z M15,3 L6.5,3 C5.67157288,3 5,3.67157288 5,4.5 L5,19.5 C5,20.3284271 5.67157288,21 6.5,21 L17.5,21 C18.3284271,21 19,20.3284271 19,19.5 L19,7 L15.5,7 C15.2238576,7 15,6.77614237 15,6.5 L15,3 Z M16,3.70710678 L16,6 L18.2928932,6 L16,3.70710678 Z M12,16.2928932 L14.1464466,14.1464466 C14.3417088,13.9511845 14.6582912,13.9511845 14.8535534,14.1464466 C15.0488155,14.3417088 15.0488155,14.6582912 14.8535534,14.8535534 L11.9198269,17.7872799 C11.8307203,17.9246987 11.6759769,18.0156098 11.5,18.0156098 C11.3240231,18.0156098 11.1692797,17.9246987 11.0801731,17.7872799 L8.14644661,14.8535534 C7.95118446,14.6582912 7.95118446,14.3417088 8.14644661,14.1464466 C8.34170876,13.9511845 8.65829124,13.9511845 8.85355339,14.1464466 L11,16.2928932 L11,9.5 C11,9.22385763 11.2238576,9 11.5,9 C11.7761424,9 12,9.22385763 12,9.5 L12,16.2928932 L12,16.2928932 Z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">Comprehensive Notes</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Capa_1" viewBox="0 0 394.497 394.497" xml:space="preserve"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <path d="M181.239,84.373c-30.412,30.413-30.412,79.896,0,110.309c15.206,15.206,35.18,22.809,55.154,22.809 s39.948-7.603,55.154-22.809c30.412-30.413,30.412-79.896,0-110.309C261.136,53.961,211.651,53.961,181.239,84.373z M295,174.026 v-68.998C307.48,126.239,307.48,152.817,295,174.026z M285,91.994v95.067c-0.177,0.181-0.343,0.37-0.522,0.55 c-26.514,26.512-69.652,26.514-96.168,0c-3.953-3.953-7.302-8.281-10.076-12.862H184c2.762,0,5-2.239,5-5s-2.238-5-5-5h-10.747 c-3.926-9.869-5.447-20.475-4.576-30.92H208c2.762,0,5-2.239,5-5s-2.238-5-5-5h-37.742c2.653-11.26,8.213-21.961,16.66-30.92H251 c2.762,0,5-2.239,5-5s-2.238-5-5-5h-52.269c11.361-7.562,24.51-11.349,37.662-11.349c17.413,0,34.827,6.628,48.084,19.885 C284.657,91.624,284.823,91.813,285,91.994z"></path> <path d="M389.225,266.902l-72.44-72.44c11.022-16.057,16.958-35.038,16.958-54.935c0-26.002-10.127-50.449-28.514-68.835 c-7.583-7.583-16.125-13.624-25.229-18.177V7.749c0-2.761-2.238-5-5-5H55.69c-1.326,0-2.598,0.527-3.535,1.464l-50.69,50.68 C0.527,55.831,0,57.103,0,58.429v328.32c0,2.761,2.238,5,5,5h270c2.762,0,5-2.239,5-5V226.54c3.882-1.941,7.658-4.157,11.303-6.649 l72.467,72.467c3.509,3.509,8.117,5.264,12.728,5.264c4.608,0,9.219-1.755,12.728-5.264c3.4-3.399,5.272-7.92,5.272-12.728 C394.497,274.822,392.625,270.302,389.225,266.902z M323.742,139.527c0,23.332-9.086,45.267-25.584,61.764 c-34.059,34.058-89.471,34.057-123.529,0c-16.498-16.498-25.584-38.433-25.584-61.764s9.086-45.267,25.584-61.764 c17.029-17.028,39.396-25.542,61.765-25.542s44.735,8.514,61.765,25.542C314.656,94.261,323.742,116.196,323.742,139.527z M50.69,19.817v33.611H17.073L50.69,19.817z M270,381.749H10V63.429h45.69c2.762,0,5-2.239,5-5v-45.68H270v35.448 c-34.511-12.638-74.79-5.156-102.441,22.496c-6.161,6.161-11.389,13.005-15.625,20.357h-46.932c-2.762,0-5,2.239-5,5s2.238,5,5,5 h41.922c-2.822,6.557-4.91,13.424-6.224,20.5H48.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h90.871c-0.213,2.64-0.326,5.301-0.326,7.979 c0,4.222,0.271,8.401,0.797,12.521H93c-2.762,0-5,2.239-5,5s2.238,5,5,5h48.656c1.676,7.109,4.145,13.978,7.364,20.5H48.5 c-2.762,0-5,2.239-5,5s2.238,5,5,5h106.222c3.678,5.64,7.964,10.941,12.836,15.814c1.642,1.642,3.343,3.186,5.07,4.686H155.5 c-2.762,0-5,2.239-5,5s2.238,5,5,5h30.89c15.335,9.179,32.667,13.781,50.004,13.781c11.394,0,22.781-2.006,33.606-5.971V381.749z M305.229,208.363c1.899-1.899,3.705-3.866,5.426-5.89l51.275,51.275l-11.314,11.314l-51.295-51.295 C301.341,212.053,303.322,210.269,305.229,208.363z M382.154,285.287c-3.119,3.119-8.195,3.119-11.314,0l-13.154-13.154 L369,260.819l13.154,13.154c1.511,1.511,2.343,3.52,2.343,5.657S383.665,283.776,382.154,285.287z"></path> <path d="M48.5,101.049h40.001c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,101.049,48.5,101.049z"></path> <path d="M48.5,162.049h27.501c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,162.049,48.5,162.049z"></path> <path d="M48.5,223.049h92.301c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,223.049,48.5,223.049z"></path> <path d="M231.5,243.549H86.501c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,243.549,231.5,243.549z"></path> <path d="M48.5,253.549h22.001c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,253.549,48.5,253.549z"></path> <path d="M231.5,304.549h-94.499c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,304.549,231.5,304.549z"></path> <path d="M48.5,314.549h72.801c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,314.549,48.5,314.549z"></path> <path d="M231.5,335.049H178c-2.762,0-5,2.239-5,5s2.238,5,5,5h53.5c2.762,0,5-2.239,5-5S234.262,335.049,231.5,335.049z"></path> <path d="M163.101,335.049h-89.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h89.5c2.762,0,5-2.239,5-5S165.862,335.049,163.101,335.049z"></path> <path d="M58.501,335.049H48.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h10.001c2.762,0,5-2.239,5-5S61.263,335.049,58.501,335.049z"></path> <path d="M231.5,274.049h-30.499c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,274.049,231.5,274.049z"></path> <path d="M48.5,284.049h135c2.762,0,5-2.239,5-5s-2.238-5-5-5h-135c-2.762,0-5,2.239-5,5S45.738,284.049,48.5,284.049z"></path> <path d="M251,123.829h-17.5c-2.762,0-5,2.239-5,5s2.238,5,5,5H251c2.762,0,5-2.239,5-5S253.762,123.829,251,123.829z"></path> <path d="M251,164.749h-46c-2.762,0-5,2.239-5,5s2.238,5,5,5h46c2.762,0,5-2.239,5-5S253.762,164.749,251,164.749z"></path> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">HackerRank Tests</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><title>screen-users</title><path d="M9.74 21c-0.001-1.721-1.396-3.115-3.116-3.115s-3.116 1.395-3.116 3.116 1.395 3.116 3.116 3.116v0c1.721-0.002 3.115-1.397 3.116-3.117v-0zM5.008 21c0.001-0.892 0.724-1.615 1.616-1.615s1.616 0.724 1.616 1.616-0.724 1.616-1.616 1.616c0 0 0 0-0 0v0c-0.893-0.001-1.616-0.724-1.616-1.617v-0zM19.117 21c-0-1.721-1.396-3.116-3.117-3.116s-3.117 1.395-3.117 3.117c0 1.721 1.395 3.116 3.116 3.117h0c1.721-0.002 3.115-1.396 3.117-3.117v-0zM14.384 21c0-0.893 0.724-1.616 1.617-1.616s1.617 0.724 1.617 1.617-0.724 1.617-1.617 1.617c-0 0-0 0-0.001 0h0c-0.893-0.001-1.616-0.724-1.616-1.617v-0zM28.492 21c-0.001-1.721-1.396-3.115-3.116-3.115s-3.116 1.395-3.116 3.116 1.395 3.116 3.116 3.116c0 0 0.001 0 0.001 0h-0c1.72-0.003 3.113-1.397 3.115-3.117v-0zM23.76 21c0.001-0.892 0.724-1.615 1.616-1.615s1.616 0.724 1.616 1.616c0 0.892-0.723 1.616-1.615 1.616h-0c-0.893-0-1.617-0.724-1.617-1.617v-0zM25.377 25.531c-1.979 0.011-3.71 1.061-4.675 2.633l-0.014 0.024c-0.972-1.603-2.707-2.657-4.688-2.657s-3.717 1.055-4.675 2.633l-0.014 0.024c-0.974-1.603-2.711-2.657-4.695-2.657-2.611 0-4.794 1.827-5.343 4.272l-0.007 0.037c-0.011 0.048-0.017 0.103-0.017 0.16 0 0.414 0.336 0.75 0.75 0.75 0.357 0 0.656-0.25 0.731-0.585l0.001-0.005c0.406-1.803 1.994-3.129 3.891-3.129s3.485 1.326 3.886 3.102l0.005 0.027c0.076 0.339 0.375 0.589 0.731 0.59h0c0.021 0 0.044-0.005 0.065-0.007 0.022 0.002 0.044 0.007 0.065 0.007 0 0 0 0 0 0 0.357 0 0.656-0.25 0.73-0.585l0.001-0.005c0.406-1.803 1.994-3.129 3.891-3.129s3.485 1.326 3.886 3.102l0.005 0.027c0.115 0.337 0.428 0.574 0.797 0.574s0.682-0.238 0.795-0.568l0.002-0.006c0.407-1.803 1.994-3.129 3.892-3.129s3.485 1.326 3.887 3.102l0.005 0.027c0.076 0.34 0.374 0.59 0.732 0.59 0 0 0.001 0 0.001 0h-0c0.057-0 0.112-0.007 0.165-0.019l-0.005 0.001c0.34-0.076 0.59-0.375 0.59-0.733 0-0.057-0.006-0.112-0.018-0.165l0.001 0.005c-0.568-2.476-2.747-4.297-5.354-4.309h-0.001zM30 1.25h-28c-0.414 0-0.75 0.336-0.75 0.75v0 14c0 0.414 0.336 0.75 0.75 0.75s0.75-0.336 0.75-0.75v0-13.25h26.5v13.25c0 0.414 0.336 0.75 0.75 0.75s0.75-0.336 0.75-0.75v0-14c-0-0.414-0.336-0.75-0.75-0.75v0z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">Topic-wise Quizzes</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Layer_1" viewBox="0 0 512.001 512.001" xml:space="preserve" stroke="#0634A1" stroke-width="7.168014000000001"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <g> <path d="M478.329,183.82H300.803c-7.9-27.511-23.412-52.593-45.133-72.042c-32.922-29.481-75.446-43.016-119.749-38.119 C64.871,81.518,8.048,138.871,0.809,210.032c-3.953,38.846,6.67,77.251,29.909,108.14c22.271,29.6,54.229,50.063,90.203,57.816 l37.845,37.844c3.177,3.178,7.395,4.861,11.698,4.86c2.138,0,4.296-0.416,6.358-1.27c6.214-2.574,10.227-8.582,10.227-15.307 V375.62c6.223-1.391,12.285-3.155,18.172-5.257v1.05c0,18.566,15.105,33.671,33.671,33.671h56.539l30.119,30.119 c2.694,2.694,6.269,4.121,9.916,4.121c1.812,0,3.641-0.353,5.389-1.076c5.267-2.182,8.67-7.275,8.67-12.976v-20.188H478.33 c18.566,0,33.671-15.105,33.671-33.671V217.489C512,198.925,496.895,183.82,478.329,183.82z M177.625,361.164 c-3.825,0.682-6.609,4.007-6.609,7.892v33.06c0,0.191,0,0.357-0.33,0.494c-0.33,0.135-0.446,0.019-0.583-0.115l-39.539-39.539 c-1.121-1.121-2.55-1.886-4.106-2.194c-33.084-6.575-62.535-25.124-82.928-52.229c-20.805-27.654-30.313-62.059-26.771-96.878 c3.121-30.685,17.014-59.873,39.119-82.19c22.109-22.32,51.16-36.479,81.805-39.868c5.332-0.59,10.628-0.882,15.885-0.882 c33.893,0,65.884,12.154,91.405,35.007c29.082,26.042,45.761,63.35,45.761,102.359 C290.735,292.663,243.166,349.473,177.625,361.164z M495.966,371.414c0,9.725-7.912,17.637-17.637,17.637H341.508 c-4.427,0-8.017,3.589-8.017,8.017v23.403l-29.071-29.071c-1.503-1.504-3.542-2.348-5.668-2.348h-59.859 c-9.725,0-17.637-7.912-17.637-17.637v-7.818c51.32-25.224,85.513-77.856,85.513-137.515c0-8.852-0.781-17.622-2.28-26.228 h173.841c9.725,0,17.637,7.912,17.637,17.637V371.414z"></path> </g> </g> <g> <g> <path d="M449.792,246.027c-3.13-3.131-8.206-3.131-11.337,0l-79.845,79.845l-37.069-37.069c-3.131-3.131-8.207-3.131-11.337,0 c-3.131,3.131-3.131,8.207,0,11.337l42.737,42.737c1.565,1.565,3.617,2.348,5.668,2.348c2.051,0,4.104-0.782,5.669-2.348 l85.513-85.513C452.923,254.233,452.923,249.157,449.792,246.027z"></path> </g> </g> <g> <g> <path d="M153.385,286.464c-0.003,0-0.007,0-0.011,0c-4.427,0-8.022,3.595-8.022,8.022c0,0.001,0,0.003,0,0.005 c0,0.002,0,0.003,0,0.005c0,4.427,3.595,8.022,8.022,8.022c0.003,0,0.008,0,0.011,0c4.427,0,8.022-3.595,8.022-8.022 c0-0.001,0-0.003,0-0.005c0-0.002,0-0.003,0-0.005C161.407,290.059,157.812,286.464,153.385,286.464z"></path> </g> </g> <g> <g> <path d="M189.094,164.713c-9.712-9.712-22.397-15.06-35.719-15.059c-27.994,0.002-50.769,22.78-50.769,50.773 c0,4.427,3.589,8.017,8.017,8.017c4.427,0,8.017-3.589,8.017-8.017c0-19.154,15.583-34.739,34.737-34.74 c9.039,0,17.697,3.679,24.38,10.362c6.683,6.683,10.363,15.342,10.363,24.381c-0.001,15.227-10.176,28.911-24.742,33.279 c-10.776,3.231-18.014,12.886-18.014,24.024v2.554c0,4.427,3.589,8.017,8.017,8.017c4.427,0,8.017-3.589,8.017-8.017v-2.554 c0-4.002,2.647-7.485,6.587-8.666c21.295-6.386,36.169-26.385,36.17-48.636C204.154,187.11,198.806,174.424,189.094,164.713z"></path> </g> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">Access to Global Peer Community</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 24 24"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><g id="Repeat"><path d="M2.078,17.562c-0.01,-0.039 -0.016,-0.08 -0.016,-0.123c0,-0.138 0.056,-0.263 0.147,-0.353c0.008,-0.009 1.416,-1.417 2,-2c0.198,-0.198 0.507,-0.183 0.707,-0c0.199,0.183 0.185,0.522 -0,0.707l-1.147,1.146l15.669,0c0.828,0 1.5,-0.671 1.5,-1.5l0,-3.439c0,-0.276 0.224,-0.5 0.5,-0.5c0.276,0 0.5,0.224 0.5,0.5l0,3.439c0,1.381 -1.12,2.5 -2.5,2.5l-15.669,0l1.147,1.147c0.198,0.198 0.183,0.507 -0,0.707c-0.183,0.199 -0.522,0.185 -0.707,-0l-2,-2c-0.066,-0.063 -0.11,-0.143 -0.131,-0.231Zm19.845,-11.105c0.01,0.039 0.015,0.08 0.015,0.122c0,0.138 -0.056,0.263 -0.147,0.354c-0.008,0.008 -1.416,1.417 -2,2c-0.197,0.198 -0.507,0.183 -0.707,-0c-0.199,-0.183 -0.185,-0.522 0,-0.707l1.147,-1.147l-15.669,0c-0.828,0 -1.5,0.672 -1.5,1.5l0,3.439c-0,0.276 -0.224,0.5 -0.5,0.5c-0.276,0 -0.5,-0.224 -0.5,-0.5l0,-3.439c0,-1.381 1.12,-2.5 2.5,-2.5l15.669,0l-1.146,-1.146c-0.198,-0.198 -0.183,-0.507 -0,-0.707c0.183,-0.199 0.522,-0.185 0.707,-0l2,2c0.065,0.063 0.11,0.143 0.131,0.231Z"></path></g></g></svg>						</span>
										<span class="elementor-icon-list-text"> Interview Prep Material</span>
									</li>
						</ul>
						</div>
				</div>
		<div class="elementor-element elementor-element-a3a97ee e-con-full e-flex e-con e-child" data-id="a3a97ee" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-e6398d7 elementor-widget__width-initial elementor-widget elementor-widget-heading" data-id="e6398d7" data-element_type="widget" data-e-type="widget" data-widget_type="heading.default">
				<div class="elementor-widget-container">
					<h2 class="elementor-heading-title elementor-size-default"><p><span style="font-size: 13px;color: black">Buy for </span><span style="font-size: 16px;color: #63b7fd;font-weight: bold">60% OFF</span><br />
<span style="font-size: 13px;color: gray;text-decoration: line-through">₹20,000.00</span><span style="font-size: 17px;color: black;font-weight: bold"> ₹8,999.00</span></p>
</h2>				</div>
				</div>
				<div class="elementor-element elementor-element-856e4c2 elementor-mobile-align-right elementor-widget-mobile__width-initial elementor-widget elementor-widget-button" data-id="856e4c2" data-element_type="widget" data-e-type="widget" data-widget_type="button.default">
				<div class="elementor-widget-container">
									<div class="elementor-button-wrapper">
					<a class="elementor-button elementor-button-link elementor-size-sm" href="https://getsdeready.com/courses/design-combined/">
						<span class="elementor-button-content-wrapper">
									<span class="elementor-button-text">Learn More</span>
					</span>
					</a>
				</div>
								</div>
				</div>
				</div>
					</div>
				</div>
				</div>
				<div data-elementor-type="loop-item" data-elementor-id="30707" class="elementor elementor-30707 swiper-slide e-loop-item e-loop-item-52990 post-52990 courses type-courses status-publish has-post-thumbnail hentry course-category-featured course-tag-algorithms course-tag-data-structures course-tag-high-level-system-design course-tag-low-level-system-design course-tag-programming course-tag-systemdesign" data-elementor-post-type="elementor_library" role="group" aria-roledescription="slide" data-custom-edit-handle="1">
			<div class="elementor-element elementor-element-3bfce03 e-flex e-con-boxed e-con e-parent" data-id="3bfce03" data-element_type="container" data-e-type="container" data-settings="{&quot;background_background&quot;:&quot;classic&quot;}">
					<div class="e-con-inner">
				<div class="elementor-element elementor-element-62ff770 elementor-widget elementor-widget-theme-post-featured-image elementor-widget-image" data-id="62ff770" data-element_type="widget" data-e-type="widget" data-widget_type="theme-post-featured-image.default">
				<div class="elementor-widget-container">
															<img loading="lazy" decoding="async" width="2560" height="1801" src="https://getsdeready.com/wp-content/uploads/2026/05/Mastering-GenAI-LLM-Engineering-scaled.webp" class="attachment-full size-full wp-image-54065" alt="" srcset="https://getsdeready.com/wp-content/uploads/2026/05/Mastering-GenAI-LLM-Engineering-scaled.webp 2560w, https://getsdeready.com/wp-content/uploads/2026/05/Mastering-GenAI-LLM-Engineering-300x211.webp 300w, https://getsdeready.com/wp-content/uploads/2026/05/Mastering-GenAI-LLM-Engineering-1024x721.webp 1024w, https://getsdeready.com/wp-content/uploads/2026/05/Mastering-GenAI-LLM-Engineering-768x540.webp 768w, https://getsdeready.com/wp-content/uploads/2026/05/Mastering-GenAI-LLM-Engineering-1536x1081.webp 1536w, https://getsdeready.com/wp-content/uploads/2026/05/Mastering-GenAI-LLM-Engineering-2048x1441.webp 2048w, https://getsdeready.com/wp-content/uploads/2026/05/Mastering-GenAI-LLM-Engineering-600x422.webp 600w, https://getsdeready.com/wp-content/uploads/2026/05/Mastering-GenAI-LLM-Engineering-71x50.webp 71w" sizes="(max-width: 2560px) 100vw, 2560px" />															</div>
				</div>
				<div class="elementor-element elementor-element-fb51e5c elementor-widget elementor-widget-heading" data-id="fb51e5c" data-element_type="widget" data-e-type="widget" data-widget_type="heading.default">
				<div class="elementor-widget-container">
					<h2 class="elementor-heading-title elementor-size-default">Mastering GenAI / LLM Engineering</h2>				</div>
				</div>
				<div class="elementor-element elementor-element-716c418 elementor-icon-list--layout-traditional elementor-list-item-link-full_width elementor-widget elementor-widget-icon-list" data-id="716c418" data-element_type="widget" data-e-type="widget" data-widget_type="icon-list.default">
				<div class="elementor-widget-container">
							<ul class="elementor-icon-list-items">
							<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><title>video-camera</title><path d="M30.395 6.362c-0.112-0.071-0.248-0.113-0.395-0.113-0.122 0-0.238 0.030-0.34 0.082l0.004-0.002-6.938 3.468c-0.106-1.426-1.287-2.543-2.729-2.548h-15.996c-1.518 0.002-2.748 1.232-2.75 2.75v12.001c0.002 1.518 1.232 2.748 2.75 2.75h15.996c1.443-0.005 2.623-1.122 2.729-2.538l0.001-0.009 6.939 3.468c0.097 0.050 0.211 0.080 0.333 0.080 0.001 0 0.002 0 0.003 0h-0c0.001 0 0.001 0 0.002 0 0.413 0 0.748-0.335 0.748-0.748 0-0.001 0-0.001 0-0.002v0-18c-0-0.268-0.141-0.503-0.352-0.636l-0.003-0.002zM21.246 22c-0.001 0.69-0.56 1.249-1.25 1.25h-15.996c-0.69-0.001-1.249-0.56-1.25-1.25v-12.001c0.001-0.69 0.56-1.249 1.25-1.25h15.996c0.69 0.001 1.249 0.56 1.25 1.25v12.001zM29.25 23.787l-6.504-3.25v-9.073l6.504-3.251z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">100+ Live Classes &amp; Recordings</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32" data-name="Layer 1" id="Layer_1" stroke="#0634A1" stroke-width="0.16"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><path d="M18,6V7H17a1,1,0,0,1-1-1V4h1V6Z"></path><path d="M17,6V7h1a1,1,0,0,0,1-1V4H18V6Z"></path><path d="M18,2V1H17a1,1,0,0,0-1,1V3h1V2Z"></path><path d="M17,2V1h1a1,1,0,0,1,1,1V4H18V2Z"></path><rect height="1" transform="translate(27 53) rotate(180)" width="19" x="4" y="26"></rect><rect height="1" transform="translate(32 59) rotate(180)" width="18" x="7" y="29"></rect><rect height="1" transform="translate(42 -13) rotate(90)" width="21" x="17" y="14"></rect><rect height="1" transform="translate(22.5 7.5) rotate(90)" width="22" x="-3.5" y="14.5"></rect><path d="M28,25H27v2a2,2,0,0,1-2,2h0v1h0a3,3,0,0,0,3-3Z"></path><path d="M22,26h1v1a2,2,0,0,0,2,2h0v1h0a3,3,0,0,1-3-3Z"></path><path d="M4,26H5v1a2,2,0,0,0,2,2H8v1H7a3,3,0,0,1-3-3Z"></path><rect height="1" width="17" x="9" y="2"></rect><path d="M25,2V3h1a1,1,0,0,1,1,1V5h1V4a2,2,0,0,0-2-2Z"></path><path d="M10,2V3H9A1,1,0,0,0,8,4V5H7V4A2,2,0,0,1,9,2Z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">24*7 Live Doubt Support</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Capa_1" viewBox="0 0 442 442" xml:space="preserve"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <path d="M179.046,93.365h84.845c2.761,0,5-2.239,5-5s-2.239-5-5-5h-84.845c-2.761,0-5,2.239-5,5S176.285,93.365,179.046,93.365z"></path> <path d="M122.977,120.046H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,120.046,122.977,120.046z "></path> <path d="M122.977,146.728H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,146.728,122.977,146.728z "></path> <path d="M122.977,173.409H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,173.409,122.977,173.409z "></path> <path d="M122.977,200.091H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,200.091,122.977,200.091z "></path> <path d="M122.977,226.772H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,226.772,122.977,226.772z "></path> <path d="M122.977,253.454H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,253.454,122.977,253.454z "></path> <path d="M122.977,280.135H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,280.135,122.977,280.135z "></path> <path d="M122.977,306.816H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,306.816,122.977,306.816z "></path> <path d="M232.008,323.498H122.977c-2.761,0-5,2.239-5,5s2.239,5,5,5h109.031c2.761,0,5-2.239,5-5S234.769,323.498,232.008,323.498z "></path> <path d="M385.536,68.464l-67-67C317.598,0.527,316.326,0,315,0H60c-2.761,0-5,2.239-5,5v432c0,2.761,2.239,5,5,5h322 c2.761,0,5-2.239,5-5V72C387,70.674,386.473,69.402,385.536,68.464z M320,17.071L369.929,67H320V17.071z M65,432V10h245v62 c0,2.761,2.239,5,5,5h62v355H65z"></path> <path d="M329.39,357.142c-0.717-1.979-2.596-3.298-4.702-3.298s-3.985,1.319-4.702,3.298l-15.366,42.453 c-0.939,2.597,0.403,5.463,3,6.403c0.562,0.203,1.136,0.3,1.701,0.3c2.046,0,3.966-1.265,4.702-3.3l4.001-11.055h13.326 l4.001,11.055c0.94,2.596,3.805,3.938,6.403,3c2.597-0.94,3.939-3.807,3-6.403L329.39,357.142z M321.645,381.943l3.043-8.409 l3.044,8.409H321.645z"></path> <path d="M342.466,304.771l-83.996,83.996c-1.953,1.953-1.953,5.119,0,7.071c0.977,0.976,2.256,1.464,3.536,1.464 s2.559-0.488,3.536-1.464l83.996-83.996c1.953-1.953,1.953-5.119,0-7.071C347.584,302.819,344.419,302.819,342.466,304.771z"></path> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">400+ Practice Questions</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 24 24"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><path d="M20,6.52797748 L20,19.5 C20,20.8807119 18.8807119,22 17.5,22 L6.5,22 C5.11928813,22 4,20.8807119 4,19.5 L4,4.5 C4,3.11928813 5.11928813,2 6.5,2 L15.4720225,2 C15.6047688,1.99158053 15.7429463,2.03583949 15.8535534,2.14644661 L19.8535534,6.14644661 C19.9641605,6.25705373 20.0084195,6.39523125 20,6.52797748 Z M15,3 L6.5,3 C5.67157288,3 5,3.67157288 5,4.5 L5,19.5 C5,20.3284271 5.67157288,21 6.5,21 L17.5,21 C18.3284271,21 19,20.3284271 19,19.5 L19,7 L15.5,7 C15.2238576,7 15,6.77614237 15,6.5 L15,3 Z M16,3.70710678 L16,6 L18.2928932,6 L16,3.70710678 Z M12,16.2928932 L14.1464466,14.1464466 C14.3417088,13.9511845 14.6582912,13.9511845 14.8535534,14.1464466 C15.0488155,14.3417088 15.0488155,14.6582912 14.8535534,14.8535534 L11.9198269,17.7872799 C11.8307203,17.9246987 11.6759769,18.0156098 11.5,18.0156098 C11.3240231,18.0156098 11.1692797,17.9246987 11.0801731,17.7872799 L8.14644661,14.8535534 C7.95118446,14.6582912 7.95118446,14.3417088 8.14644661,14.1464466 C8.34170876,13.9511845 8.65829124,13.9511845 8.85355339,14.1464466 L11,16.2928932 L11,9.5 C11,9.22385763 11.2238576,9 11.5,9 C11.7761424,9 12,9.22385763 12,9.5 L12,16.2928932 L12,16.2928932 Z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">Comprehensive Notes</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Capa_1" viewBox="0 0 394.497 394.497" xml:space="preserve"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <path d="M181.239,84.373c-30.412,30.413-30.412,79.896,0,110.309c15.206,15.206,35.18,22.809,55.154,22.809 s39.948-7.603,55.154-22.809c30.412-30.413,30.412-79.896,0-110.309C261.136,53.961,211.651,53.961,181.239,84.373z M295,174.026 v-68.998C307.48,126.239,307.48,152.817,295,174.026z M285,91.994v95.067c-0.177,0.181-0.343,0.37-0.522,0.55 c-26.514,26.512-69.652,26.514-96.168,0c-3.953-3.953-7.302-8.281-10.076-12.862H184c2.762,0,5-2.239,5-5s-2.238-5-5-5h-10.747 c-3.926-9.869-5.447-20.475-4.576-30.92H208c2.762,0,5-2.239,5-5s-2.238-5-5-5h-37.742c2.653-11.26,8.213-21.961,16.66-30.92H251 c2.762,0,5-2.239,5-5s-2.238-5-5-5h-52.269c11.361-7.562,24.51-11.349,37.662-11.349c17.413,0,34.827,6.628,48.084,19.885 C284.657,91.624,284.823,91.813,285,91.994z"></path> <path d="M389.225,266.902l-72.44-72.44c11.022-16.057,16.958-35.038,16.958-54.935c0-26.002-10.127-50.449-28.514-68.835 c-7.583-7.583-16.125-13.624-25.229-18.177V7.749c0-2.761-2.238-5-5-5H55.69c-1.326,0-2.598,0.527-3.535,1.464l-50.69,50.68 C0.527,55.831,0,57.103,0,58.429v328.32c0,2.761,2.238,5,5,5h270c2.762,0,5-2.239,5-5V226.54c3.882-1.941,7.658-4.157,11.303-6.649 l72.467,72.467c3.509,3.509,8.117,5.264,12.728,5.264c4.608,0,9.219-1.755,12.728-5.264c3.4-3.399,5.272-7.92,5.272-12.728 C394.497,274.822,392.625,270.302,389.225,266.902z M323.742,139.527c0,23.332-9.086,45.267-25.584,61.764 c-34.059,34.058-89.471,34.057-123.529,0c-16.498-16.498-25.584-38.433-25.584-61.764s9.086-45.267,25.584-61.764 c17.029-17.028,39.396-25.542,61.765-25.542s44.735,8.514,61.765,25.542C314.656,94.261,323.742,116.196,323.742,139.527z M50.69,19.817v33.611H17.073L50.69,19.817z M270,381.749H10V63.429h45.69c2.762,0,5-2.239,5-5v-45.68H270v35.448 c-34.511-12.638-74.79-5.156-102.441,22.496c-6.161,6.161-11.389,13.005-15.625,20.357h-46.932c-2.762,0-5,2.239-5,5s2.238,5,5,5 h41.922c-2.822,6.557-4.91,13.424-6.224,20.5H48.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h90.871c-0.213,2.64-0.326,5.301-0.326,7.979 c0,4.222,0.271,8.401,0.797,12.521H93c-2.762,0-5,2.239-5,5s2.238,5,5,5h48.656c1.676,7.109,4.145,13.978,7.364,20.5H48.5 c-2.762,0-5,2.239-5,5s2.238,5,5,5h106.222c3.678,5.64,7.964,10.941,12.836,15.814c1.642,1.642,3.343,3.186,5.07,4.686H155.5 c-2.762,0-5,2.239-5,5s2.238,5,5,5h30.89c15.335,9.179,32.667,13.781,50.004,13.781c11.394,0,22.781-2.006,33.606-5.971V381.749z M305.229,208.363c1.899-1.899,3.705-3.866,5.426-5.89l51.275,51.275l-11.314,11.314l-51.295-51.295 C301.341,212.053,303.322,210.269,305.229,208.363z M382.154,285.287c-3.119,3.119-8.195,3.119-11.314,0l-13.154-13.154 L369,260.819l13.154,13.154c1.511,1.511,2.343,3.52,2.343,5.657S383.665,283.776,382.154,285.287z"></path> <path d="M48.5,101.049h40.001c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,101.049,48.5,101.049z"></path> <path d="M48.5,162.049h27.501c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,162.049,48.5,162.049z"></path> <path d="M48.5,223.049h92.301c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,223.049,48.5,223.049z"></path> <path d="M231.5,243.549H86.501c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,243.549,231.5,243.549z"></path> <path d="M48.5,253.549h22.001c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,253.549,48.5,253.549z"></path> <path d="M231.5,304.549h-94.499c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,304.549,231.5,304.549z"></path> <path d="M48.5,314.549h72.801c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,314.549,48.5,314.549z"></path> <path d="M231.5,335.049H178c-2.762,0-5,2.239-5,5s2.238,5,5,5h53.5c2.762,0,5-2.239,5-5S234.262,335.049,231.5,335.049z"></path> <path d="M163.101,335.049h-89.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h89.5c2.762,0,5-2.239,5-5S165.862,335.049,163.101,335.049z"></path> <path d="M58.501,335.049H48.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h10.001c2.762,0,5-2.239,5-5S61.263,335.049,58.501,335.049z"></path> <path d="M231.5,274.049h-30.499c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,274.049,231.5,274.049z"></path> <path d="M48.5,284.049h135c2.762,0,5-2.239,5-5s-2.238-5-5-5h-135c-2.762,0-5,2.239-5,5S45.738,284.049,48.5,284.049z"></path> <path d="M251,123.829h-17.5c-2.762,0-5,2.239-5,5s2.238,5,5,5H251c2.762,0,5-2.239,5-5S253.762,123.829,251,123.829z"></path> <path d="M251,164.749h-46c-2.762,0-5,2.239-5,5s2.238,5,5,5h46c2.762,0,5-2.239,5-5S253.762,164.749,251,164.749z"></path> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">HackerRank Tests &amp; Quizzes</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><title>screen-users</title><path d="M9.74 21c-0.001-1.721-1.396-3.115-3.116-3.115s-3.116 1.395-3.116 3.116 1.395 3.116 3.116 3.116v0c1.721-0.002 3.115-1.397 3.116-3.117v-0zM5.008 21c0.001-0.892 0.724-1.615 1.616-1.615s1.616 0.724 1.616 1.616-0.724 1.616-1.616 1.616c0 0 0 0-0 0v0c-0.893-0.001-1.616-0.724-1.616-1.617v-0zM19.117 21c-0-1.721-1.396-3.116-3.117-3.116s-3.117 1.395-3.117 3.117c0 1.721 1.395 3.116 3.116 3.117h0c1.721-0.002 3.115-1.396 3.117-3.117v-0zM14.384 21c0-0.893 0.724-1.616 1.617-1.616s1.617 0.724 1.617 1.617-0.724 1.617-1.617 1.617c-0 0-0 0-0.001 0h0c-0.893-0.001-1.616-0.724-1.616-1.617v-0zM28.492 21c-0.001-1.721-1.396-3.115-3.116-3.115s-3.116 1.395-3.116 3.116 1.395 3.116 3.116 3.116c0 0 0.001 0 0.001 0h-0c1.72-0.003 3.113-1.397 3.115-3.117v-0zM23.76 21c0.001-0.892 0.724-1.615 1.616-1.615s1.616 0.724 1.616 1.616c0 0.892-0.723 1.616-1.615 1.616h-0c-0.893-0-1.617-0.724-1.617-1.617v-0zM25.377 25.531c-1.979 0.011-3.71 1.061-4.675 2.633l-0.014 0.024c-0.972-1.603-2.707-2.657-4.688-2.657s-3.717 1.055-4.675 2.633l-0.014 0.024c-0.974-1.603-2.711-2.657-4.695-2.657-2.611 0-4.794 1.827-5.343 4.272l-0.007 0.037c-0.011 0.048-0.017 0.103-0.017 0.16 0 0.414 0.336 0.75 0.75 0.75 0.357 0 0.656-0.25 0.731-0.585l0.001-0.005c0.406-1.803 1.994-3.129 3.891-3.129s3.485 1.326 3.886 3.102l0.005 0.027c0.076 0.339 0.375 0.589 0.731 0.59h0c0.021 0 0.044-0.005 0.065-0.007 0.022 0.002 0.044 0.007 0.065 0.007 0 0 0 0 0 0 0.357 0 0.656-0.25 0.73-0.585l0.001-0.005c0.406-1.803 1.994-3.129 3.891-3.129s3.485 1.326 3.886 3.102l0.005 0.027c0.115 0.337 0.428 0.574 0.797 0.574s0.682-0.238 0.795-0.568l0.002-0.006c0.407-1.803 1.994-3.129 3.892-3.129s3.485 1.326 3.887 3.102l0.005 0.027c0.076 0.34 0.374 0.59 0.732 0.59 0 0 0.001 0 0.001 0h-0c0.057-0 0.112-0.007 0.165-0.019l-0.005 0.001c0.34-0.076 0.59-0.375 0.59-0.733 0-0.057-0.006-0.112-0.018-0.165l0.001 0.005c-0.568-2.476-2.747-4.297-5.354-4.309h-0.001zM30 1.25h-28c-0.414 0-0.75 0.336-0.75 0.75v0 14c0 0.414 0.336 0.75 0.75 0.75s0.75-0.336 0.75-0.75v0-13.25h26.5v13.25c0 0.414 0.336 0.75 0.75 0.75s0.75-0.336 0.75-0.75v0-14c-0-0.414-0.336-0.75-0.75-0.75v0z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">Topic-wise Quizzes</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Layer_1" viewBox="0 0 512.001 512.001" xml:space="preserve" stroke="#0634A1" stroke-width="7.168014000000001"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <g> <path d="M478.329,183.82H300.803c-7.9-27.511-23.412-52.593-45.133-72.042c-32.922-29.481-75.446-43.016-119.749-38.119 C64.871,81.518,8.048,138.871,0.809,210.032c-3.953,38.846,6.67,77.251,29.909,108.14c22.271,29.6,54.229,50.063,90.203,57.816 l37.845,37.844c3.177,3.178,7.395,4.861,11.698,4.86c2.138,0,4.296-0.416,6.358-1.27c6.214-2.574,10.227-8.582,10.227-15.307 V375.62c6.223-1.391,12.285-3.155,18.172-5.257v1.05c0,18.566,15.105,33.671,33.671,33.671h56.539l30.119,30.119 c2.694,2.694,6.269,4.121,9.916,4.121c1.812,0,3.641-0.353,5.389-1.076c5.267-2.182,8.67-7.275,8.67-12.976v-20.188H478.33 c18.566,0,33.671-15.105,33.671-33.671V217.489C512,198.925,496.895,183.82,478.329,183.82z M177.625,361.164 c-3.825,0.682-6.609,4.007-6.609,7.892v33.06c0,0.191,0,0.357-0.33,0.494c-0.33,0.135-0.446,0.019-0.583-0.115l-39.539-39.539 c-1.121-1.121-2.55-1.886-4.106-2.194c-33.084-6.575-62.535-25.124-82.928-52.229c-20.805-27.654-30.313-62.059-26.771-96.878 c3.121-30.685,17.014-59.873,39.119-82.19c22.109-22.32,51.16-36.479,81.805-39.868c5.332-0.59,10.628-0.882,15.885-0.882 c33.893,0,65.884,12.154,91.405,35.007c29.082,26.042,45.761,63.35,45.761,102.359 C290.735,292.663,243.166,349.473,177.625,361.164z M495.966,371.414c0,9.725-7.912,17.637-17.637,17.637H341.508 c-4.427,0-8.017,3.589-8.017,8.017v23.403l-29.071-29.071c-1.503-1.504-3.542-2.348-5.668-2.348h-59.859 c-9.725,0-17.637-7.912-17.637-17.637v-7.818c51.32-25.224,85.513-77.856,85.513-137.515c0-8.852-0.781-17.622-2.28-26.228 h173.841c9.725,0,17.637,7.912,17.637,17.637V371.414z"></path> </g> </g> <g> <g> <path d="M449.792,246.027c-3.13-3.131-8.206-3.131-11.337,0l-79.845,79.845l-37.069-37.069c-3.131-3.131-8.207-3.131-11.337,0 c-3.131,3.131-3.131,8.207,0,11.337l42.737,42.737c1.565,1.565,3.617,2.348,5.668,2.348c2.051,0,4.104-0.782,5.669-2.348 l85.513-85.513C452.923,254.233,452.923,249.157,449.792,246.027z"></path> </g> </g> <g> <g> <path d="M153.385,286.464c-0.003,0-0.007,0-0.011,0c-4.427,0-8.022,3.595-8.022,8.022c0,0.001,0,0.003,0,0.005 c0,0.002,0,0.003,0,0.005c0,4.427,3.595,8.022,8.022,8.022c0.003,0,0.008,0,0.011,0c4.427,0,8.022-3.595,8.022-8.022 c0-0.001,0-0.003,0-0.005c0-0.002,0-0.003,0-0.005C161.407,290.059,157.812,286.464,153.385,286.464z"></path> </g> </g> <g> <g> <path d="M189.094,164.713c-9.712-9.712-22.397-15.06-35.719-15.059c-27.994,0.002-50.769,22.78-50.769,50.773 c0,4.427,3.589,8.017,8.017,8.017c4.427,0,8.017-3.589,8.017-8.017c0-19.154,15.583-34.739,34.737-34.74 c9.039,0,17.697,3.679,24.38,10.362c6.683,6.683,10.363,15.342,10.363,24.381c-0.001,15.227-10.176,28.911-24.742,33.279 c-10.776,3.231-18.014,12.886-18.014,24.024v2.554c0,4.427,3.589,8.017,8.017,8.017c4.427,0,8.017-3.589,8.017-8.017v-2.554 c0-4.002,2.647-7.485,6.587-8.666c21.295-6.386,36.169-26.385,36.17-48.636C204.154,187.11,198.806,174.424,189.094,164.713z"></path> </g> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">Case Studies</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 24 24"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><g id="Repeat"><path d="M2.078,17.562c-0.01,-0.039 -0.016,-0.08 -0.016,-0.123c0,-0.138 0.056,-0.263 0.147,-0.353c0.008,-0.009 1.416,-1.417 2,-2c0.198,-0.198 0.507,-0.183 0.707,-0c0.199,0.183 0.185,0.522 -0,0.707l-1.147,1.146l15.669,0c0.828,0 1.5,-0.671 1.5,-1.5l0,-3.439c0,-0.276 0.224,-0.5 0.5,-0.5c0.276,0 0.5,0.224 0.5,0.5l0,3.439c0,1.381 -1.12,2.5 -2.5,2.5l-15.669,0l1.147,1.147c0.198,0.198 0.183,0.507 -0,0.707c-0.183,0.199 -0.522,0.185 -0.707,-0l-2,-2c-0.066,-0.063 -0.11,-0.143 -0.131,-0.231Zm19.845,-11.105c0.01,0.039 0.015,0.08 0.015,0.122c0,0.138 -0.056,0.263 -0.147,0.354c-0.008,0.008 -1.416,1.417 -2,2c-0.197,0.198 -0.507,0.183 -0.707,-0c-0.199,-0.183 -0.185,-0.522 0,-0.707l1.147,-1.147l-15.669,0c-0.828,0 -1.5,0.672 -1.5,1.5l0,3.439c-0,0.276 -0.224,0.5 -0.5,0.5c-0.276,0 -0.5,-0.224 -0.5,-0.5l0,-3.439c0,-1.381 1.12,-2.5 2.5,-2.5l15.669,0l-1.146,-1.146c-0.198,-0.198 -0.183,-0.507 -0,-0.707c0.183,-0.199 0.522,-0.185 0.707,-0l2,2c0.065,0.063 0.11,0.143 0.131,0.231Z"></path></g></g></svg>						</span>
										<span class="elementor-icon-list-text"> Access to Global Peer Community</span>
									</li>
						</ul>
						</div>
				</div>
		<div class="elementor-element elementor-element-a3a97ee e-con-full e-flex e-con e-child" data-id="a3a97ee" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-e6398d7 elementor-widget__width-initial elementor-widget elementor-widget-heading" data-id="e6398d7" data-element_type="widget" data-e-type="widget" data-widget_type="heading.default">
				<div class="elementor-widget-container">
					<h2 class="elementor-heading-title elementor-size-default"><p><span style="font-size: 13px;color: black">Buy for </span><span style="font-size: 16px;color: #63b7fd;font-weight: bold">50% OFF</span><br />
<span style="font-size: 13px;color: gray;text-decoration: line-through">₹39,999.00</span><span style="font-size: 17px;color: black;font-weight: bold"> ₹19,999.00</span></p>
</h2>				</div>
				</div>
				<div class="elementor-element elementor-element-856e4c2 elementor-mobile-align-right elementor-widget-mobile__width-initial elementor-widget elementor-widget-button" data-id="856e4c2" data-element_type="widget" data-e-type="widget" data-widget_type="button.default">
				<div class="elementor-widget-container">
									<div class="elementor-button-wrapper">
					<a class="elementor-button elementor-button-link elementor-size-sm" href="https://getsdeready.com/courses/mastering-genai-llm-engineering/">
						<span class="elementor-button-content-wrapper">
									<span class="elementor-button-text">Learn More</span>
					</span>
					</a>
				</div>
								</div>
				</div>
				</div>
					</div>
				</div>
				</div>
				<div data-elementor-type="loop-item" data-elementor-id="30707" class="elementor elementor-30707 swiper-slide e-loop-item e-loop-item-573 post-573 courses type-courses status-publish has-post-thumbnail hentry course-category-dsa course-category-featured course-tag-algorithms course-tag-data-structures course-tag-programming" data-elementor-post-type="elementor_library" role="group" aria-roledescription="slide" data-custom-edit-handle="1">
			<div class="elementor-element elementor-element-3bfce03 e-flex e-con-boxed e-con e-parent" data-id="3bfce03" data-element_type="container" data-e-type="container" data-settings="{&quot;background_background&quot;:&quot;classic&quot;}">
					<div class="e-con-inner">
				<div class="elementor-element elementor-element-62ff770 elementor-widget elementor-widget-theme-post-featured-image elementor-widget-image" data-id="62ff770" data-element_type="widget" data-e-type="widget" data-widget_type="theme-post-featured-image.default">
				<div class="elementor-widget-container">
															<img loading="lazy" decoding="async" width="768" height="432" src="https://getsdeready.com/wp-content/uploads/2024/03/6-2-min.png" class="attachment-full size-full wp-image-13201" alt="" srcset="https://getsdeready.com/wp-content/uploads/2024/03/6-2-min.png 768w, https://getsdeready.com/wp-content/uploads/2024/03/6-2-min-300x169.png 300w, https://getsdeready.com/wp-content/uploads/2024/03/6-2-min-160x90.png 160w, https://getsdeready.com/wp-content/uploads/2024/03/6-2-min-600x338.png 600w, https://getsdeready.com/wp-content/uploads/2024/03/6-2-min-89x50.png 89w" sizes="(max-width: 768px) 100vw, 768px" />															</div>
				</div>
				<div class="elementor-element elementor-element-fb51e5c elementor-widget elementor-widget-heading" data-id="fb51e5c" data-element_type="widget" data-e-type="widget" data-widget_type="heading.default">
				<div class="elementor-widget-container">
					<h2 class="elementor-heading-title elementor-size-default">Mastering Data Structures &#038; Algorithms</h2>				</div>
				</div>
				<div class="elementor-element elementor-element-716c418 elementor-icon-list--layout-traditional elementor-list-item-link-full_width elementor-widget elementor-widget-icon-list" data-id="716c418" data-element_type="widget" data-e-type="widget" data-widget_type="icon-list.default">
				<div class="elementor-widget-container">
							<ul class="elementor-icon-list-items">
							<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><title>video-camera</title><path d="M30.395 6.362c-0.112-0.071-0.248-0.113-0.395-0.113-0.122 0-0.238 0.030-0.34 0.082l0.004-0.002-6.938 3.468c-0.106-1.426-1.287-2.543-2.729-2.548h-15.996c-1.518 0.002-2.748 1.232-2.75 2.75v12.001c0.002 1.518 1.232 2.748 2.75 2.75h15.996c1.443-0.005 2.623-1.122 2.729-2.538l0.001-0.009 6.939 3.468c0.097 0.050 0.211 0.080 0.333 0.080 0.001 0 0.002 0 0.003 0h-0c0.001 0 0.001 0 0.002 0 0.413 0 0.748-0.335 0.748-0.748 0-0.001 0-0.001 0-0.002v0-18c-0-0.268-0.141-0.503-0.352-0.636l-0.003-0.002zM21.246 22c-0.001 0.69-0.56 1.249-1.25 1.25h-15.996c-0.69-0.001-1.249-0.56-1.25-1.25v-12.001c0.001-0.69 0.56-1.249 1.25-1.25h15.996c0.69 0.001 1.249 0.56 1.25 1.25v12.001zM29.25 23.787l-6.504-3.25v-9.073l6.504-3.251z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">65+ Live Classes &amp; Recordings</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32" data-name="Layer 1" id="Layer_1" stroke="#0634A1" stroke-width="0.16"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><path d="M18,6V7H17a1,1,0,0,1-1-1V4h1V6Z"></path><path d="M17,6V7h1a1,1,0,0,0,1-1V4H18V6Z"></path><path d="M18,2V1H17a1,1,0,0,0-1,1V3h1V2Z"></path><path d="M17,2V1h1a1,1,0,0,1,1,1V4H18V2Z"></path><rect height="1" transform="translate(27 53) rotate(180)" width="19" x="4" y="26"></rect><rect height="1" transform="translate(32 59) rotate(180)" width="18" x="7" y="29"></rect><rect height="1" transform="translate(42 -13) rotate(90)" width="21" x="17" y="14"></rect><rect height="1" transform="translate(22.5 7.5) rotate(90)" width="22" x="-3.5" y="14.5"></rect><path d="M28,25H27v2a2,2,0,0,1-2,2h0v1h0a3,3,0,0,0,3-3Z"></path><path d="M22,26h1v1a2,2,0,0,0,2,2h0v1h0a3,3,0,0,1-3-3Z"></path><path d="M4,26H5v1a2,2,0,0,0,2,2H8v1H7a3,3,0,0,1-3-3Z"></path><rect height="1" width="17" x="9" y="2"></rect><path d="M25,2V3h1a1,1,0,0,1,1,1V5h1V4a2,2,0,0,0-2-2Z"></path><path d="M10,2V3H9A1,1,0,0,0,8,4V5H7V4A2,2,0,0,1,9,2Z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">24*7 Live Doubt Support</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Capa_1" viewBox="0 0 442 442" xml:space="preserve"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <path d="M179.046,93.365h84.845c2.761,0,5-2.239,5-5s-2.239-5-5-5h-84.845c-2.761,0-5,2.239-5,5S176.285,93.365,179.046,93.365z"></path> <path d="M122.977,120.046H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,120.046,122.977,120.046z "></path> <path d="M122.977,146.728H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,146.728,122.977,146.728z "></path> <path d="M122.977,173.409H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,173.409,122.977,173.409z "></path> <path d="M122.977,200.091H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,200.091,122.977,200.091z "></path> <path d="M122.977,226.772H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,226.772,122.977,226.772z "></path> <path d="M122.977,253.454H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,253.454,122.977,253.454z "></path> <path d="M122.977,280.135H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,280.135,122.977,280.135z "></path> <path d="M122.977,306.816H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,306.816,122.977,306.816z "></path> <path d="M232.008,323.498H122.977c-2.761,0-5,2.239-5,5s2.239,5,5,5h109.031c2.761,0,5-2.239,5-5S234.769,323.498,232.008,323.498z "></path> <path d="M385.536,68.464l-67-67C317.598,0.527,316.326,0,315,0H60c-2.761,0-5,2.239-5,5v432c0,2.761,2.239,5,5,5h322 c2.761,0,5-2.239,5-5V72C387,70.674,386.473,69.402,385.536,68.464z M320,17.071L369.929,67H320V17.071z M65,432V10h245v62 c0,2.761,2.239,5,5,5h62v355H65z"></path> <path d="M329.39,357.142c-0.717-1.979-2.596-3.298-4.702-3.298s-3.985,1.319-4.702,3.298l-15.366,42.453 c-0.939,2.597,0.403,5.463,3,6.403c0.562,0.203,1.136,0.3,1.701,0.3c2.046,0,3.966-1.265,4.702-3.3l4.001-11.055h13.326 l4.001,11.055c0.94,2.596,3.805,3.938,6.403,3c2.597-0.94,3.939-3.807,3-6.403L329.39,357.142z M321.645,381.943l3.043-8.409 l3.044,8.409H321.645z"></path> <path d="M342.466,304.771l-83.996,83.996c-1.953,1.953-1.953,5.119,0,7.071c0.977,0.976,2.256,1.464,3.536,1.464 s2.559-0.488,3.536-1.464l83.996-83.996c1.953-1.953,1.953-5.119,0-7.071C347.584,302.819,344.419,302.819,342.466,304.771z"></path> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">400+ DSA Practice Questions</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 24 24"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><path d="M20,6.52797748 L20,19.5 C20,20.8807119 18.8807119,22 17.5,22 L6.5,22 C5.11928813,22 4,20.8807119 4,19.5 L4,4.5 C4,3.11928813 5.11928813,2 6.5,2 L15.4720225,2 C15.6047688,1.99158053 15.7429463,2.03583949 15.8535534,2.14644661 L19.8535534,6.14644661 C19.9641605,6.25705373 20.0084195,6.39523125 20,6.52797748 Z M15,3 L6.5,3 C5.67157288,3 5,3.67157288 5,4.5 L5,19.5 C5,20.3284271 5.67157288,21 6.5,21 L17.5,21 C18.3284271,21 19,20.3284271 19,19.5 L19,7 L15.5,7 C15.2238576,7 15,6.77614237 15,6.5 L15,3 Z M16,3.70710678 L16,6 L18.2928932,6 L16,3.70710678 Z M12,16.2928932 L14.1464466,14.1464466 C14.3417088,13.9511845 14.6582912,13.9511845 14.8535534,14.1464466 C15.0488155,14.3417088 15.0488155,14.6582912 14.8535534,14.8535534 L11.9198269,17.7872799 C11.8307203,17.9246987 11.6759769,18.0156098 11.5,18.0156098 C11.3240231,18.0156098 11.1692797,17.9246987 11.0801731,17.7872799 L8.14644661,14.8535534 C7.95118446,14.6582912 7.95118446,14.3417088 8.14644661,14.1464466 C8.34170876,13.9511845 8.65829124,13.9511845 8.85355339,14.1464466 L11,16.2928932 L11,9.5 C11,9.22385763 11.2238576,9 11.5,9 C11.7761424,9 12,9.22385763 12,9.5 L12,16.2928932 L12,16.2928932 Z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">Comprehensive Notes</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Capa_1" viewBox="0 0 394.497 394.497" xml:space="preserve"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <path d="M181.239,84.373c-30.412,30.413-30.412,79.896,0,110.309c15.206,15.206,35.18,22.809,55.154,22.809 s39.948-7.603,55.154-22.809c30.412-30.413,30.412-79.896,0-110.309C261.136,53.961,211.651,53.961,181.239,84.373z M295,174.026 v-68.998C307.48,126.239,307.48,152.817,295,174.026z M285,91.994v95.067c-0.177,0.181-0.343,0.37-0.522,0.55 c-26.514,26.512-69.652,26.514-96.168,0c-3.953-3.953-7.302-8.281-10.076-12.862H184c2.762,0,5-2.239,5-5s-2.238-5-5-5h-10.747 c-3.926-9.869-5.447-20.475-4.576-30.92H208c2.762,0,5-2.239,5-5s-2.238-5-5-5h-37.742c2.653-11.26,8.213-21.961,16.66-30.92H251 c2.762,0,5-2.239,5-5s-2.238-5-5-5h-52.269c11.361-7.562,24.51-11.349,37.662-11.349c17.413,0,34.827,6.628,48.084,19.885 C284.657,91.624,284.823,91.813,285,91.994z"></path> <path d="M389.225,266.902l-72.44-72.44c11.022-16.057,16.958-35.038,16.958-54.935c0-26.002-10.127-50.449-28.514-68.835 c-7.583-7.583-16.125-13.624-25.229-18.177V7.749c0-2.761-2.238-5-5-5H55.69c-1.326,0-2.598,0.527-3.535,1.464l-50.69,50.68 C0.527,55.831,0,57.103,0,58.429v328.32c0,2.761,2.238,5,5,5h270c2.762,0,5-2.239,5-5V226.54c3.882-1.941,7.658-4.157,11.303-6.649 l72.467,72.467c3.509,3.509,8.117,5.264,12.728,5.264c4.608,0,9.219-1.755,12.728-5.264c3.4-3.399,5.272-7.92,5.272-12.728 C394.497,274.822,392.625,270.302,389.225,266.902z M323.742,139.527c0,23.332-9.086,45.267-25.584,61.764 c-34.059,34.058-89.471,34.057-123.529,0c-16.498-16.498-25.584-38.433-25.584-61.764s9.086-45.267,25.584-61.764 c17.029-17.028,39.396-25.542,61.765-25.542s44.735,8.514,61.765,25.542C314.656,94.261,323.742,116.196,323.742,139.527z M50.69,19.817v33.611H17.073L50.69,19.817z M270,381.749H10V63.429h45.69c2.762,0,5-2.239,5-5v-45.68H270v35.448 c-34.511-12.638-74.79-5.156-102.441,22.496c-6.161,6.161-11.389,13.005-15.625,20.357h-46.932c-2.762,0-5,2.239-5,5s2.238,5,5,5 h41.922c-2.822,6.557-4.91,13.424-6.224,20.5H48.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h90.871c-0.213,2.64-0.326,5.301-0.326,7.979 c0,4.222,0.271,8.401,0.797,12.521H93c-2.762,0-5,2.239-5,5s2.238,5,5,5h48.656c1.676,7.109,4.145,13.978,7.364,20.5H48.5 c-2.762,0-5,2.239-5,5s2.238,5,5,5h106.222c3.678,5.64,7.964,10.941,12.836,15.814c1.642,1.642,3.343,3.186,5.07,4.686H155.5 c-2.762,0-5,2.239-5,5s2.238,5,5,5h30.89c15.335,9.179,32.667,13.781,50.004,13.781c11.394,0,22.781-2.006,33.606-5.971V381.749z M305.229,208.363c1.899-1.899,3.705-3.866,5.426-5.89l51.275,51.275l-11.314,11.314l-51.295-51.295 C301.341,212.053,303.322,210.269,305.229,208.363z M382.154,285.287c-3.119,3.119-8.195,3.119-11.314,0l-13.154-13.154 L369,260.819l13.154,13.154c1.511,1.511,2.343,3.52,2.343,5.657S383.665,283.776,382.154,285.287z"></path> <path d="M48.5,101.049h40.001c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,101.049,48.5,101.049z"></path> <path d="M48.5,162.049h27.501c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,162.049,48.5,162.049z"></path> <path d="M48.5,223.049h92.301c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,223.049,48.5,223.049z"></path> <path d="M231.5,243.549H86.501c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,243.549,231.5,243.549z"></path> <path d="M48.5,253.549h22.001c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,253.549,48.5,253.549z"></path> <path d="M231.5,304.549h-94.499c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,304.549,231.5,304.549z"></path> <path d="M48.5,314.549h72.801c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,314.549,48.5,314.549z"></path> <path d="M231.5,335.049H178c-2.762,0-5,2.239-5,5s2.238,5,5,5h53.5c2.762,0,5-2.239,5-5S234.262,335.049,231.5,335.049z"></path> <path d="M163.101,335.049h-89.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h89.5c2.762,0,5-2.239,5-5S165.862,335.049,163.101,335.049z"></path> <path d="M58.501,335.049H48.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h10.001c2.762,0,5-2.239,5-5S61.263,335.049,58.501,335.049z"></path> <path d="M231.5,274.049h-30.499c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,274.049,231.5,274.049z"></path> <path d="M48.5,284.049h135c2.762,0,5-2.239,5-5s-2.238-5-5-5h-135c-2.762,0-5,2.239-5,5S45.738,284.049,48.5,284.049z"></path> <path d="M251,123.829h-17.5c-2.762,0-5,2.239-5,5s2.238,5,5,5H251c2.762,0,5-2.239,5-5S253.762,123.829,251,123.829z"></path> <path d="M251,164.749h-46c-2.762,0-5,2.239-5,5s2.238,5,5,5h46c2.762,0,5-2.239,5-5S253.762,164.749,251,164.749z"></path> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">HackerRank Tests</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><title>screen-users</title><path d="M9.74 21c-0.001-1.721-1.396-3.115-3.116-3.115s-3.116 1.395-3.116 3.116 1.395 3.116 3.116 3.116v0c1.721-0.002 3.115-1.397 3.116-3.117v-0zM5.008 21c0.001-0.892 0.724-1.615 1.616-1.615s1.616 0.724 1.616 1.616-0.724 1.616-1.616 1.616c0 0 0 0-0 0v0c-0.893-0.001-1.616-0.724-1.616-1.617v-0zM19.117 21c-0-1.721-1.396-3.116-3.117-3.116s-3.117 1.395-3.117 3.117c0 1.721 1.395 3.116 3.116 3.117h0c1.721-0.002 3.115-1.396 3.117-3.117v-0zM14.384 21c0-0.893 0.724-1.616 1.617-1.616s1.617 0.724 1.617 1.617-0.724 1.617-1.617 1.617c-0 0-0 0-0.001 0h0c-0.893-0.001-1.616-0.724-1.616-1.617v-0zM28.492 21c-0.001-1.721-1.396-3.115-3.116-3.115s-3.116 1.395-3.116 3.116 1.395 3.116 3.116 3.116c0 0 0.001 0 0.001 0h-0c1.72-0.003 3.113-1.397 3.115-3.117v-0zM23.76 21c0.001-0.892 0.724-1.615 1.616-1.615s1.616 0.724 1.616 1.616c0 0.892-0.723 1.616-1.615 1.616h-0c-0.893-0-1.617-0.724-1.617-1.617v-0zM25.377 25.531c-1.979 0.011-3.71 1.061-4.675 2.633l-0.014 0.024c-0.972-1.603-2.707-2.657-4.688-2.657s-3.717 1.055-4.675 2.633l-0.014 0.024c-0.974-1.603-2.711-2.657-4.695-2.657-2.611 0-4.794 1.827-5.343 4.272l-0.007 0.037c-0.011 0.048-0.017 0.103-0.017 0.16 0 0.414 0.336 0.75 0.75 0.75 0.357 0 0.656-0.25 0.731-0.585l0.001-0.005c0.406-1.803 1.994-3.129 3.891-3.129s3.485 1.326 3.886 3.102l0.005 0.027c0.076 0.339 0.375 0.589 0.731 0.59h0c0.021 0 0.044-0.005 0.065-0.007 0.022 0.002 0.044 0.007 0.065 0.007 0 0 0 0 0 0 0.357 0 0.656-0.25 0.73-0.585l0.001-0.005c0.406-1.803 1.994-3.129 3.891-3.129s3.485 1.326 3.886 3.102l0.005 0.027c0.115 0.337 0.428 0.574 0.797 0.574s0.682-0.238 0.795-0.568l0.002-0.006c0.407-1.803 1.994-3.129 3.892-3.129s3.485 1.326 3.887 3.102l0.005 0.027c0.076 0.34 0.374 0.59 0.732 0.59 0 0 0.001 0 0.001 0h-0c0.057-0 0.112-0.007 0.165-0.019l-0.005 0.001c0.34-0.076 0.59-0.375 0.59-0.733 0-0.057-0.006-0.112-0.018-0.165l0.001 0.005c-0.568-2.476-2.747-4.297-5.354-4.309h-0.001zM30 1.25h-28c-0.414 0-0.75 0.336-0.75 0.75v0 14c0 0.414 0.336 0.75 0.75 0.75s0.75-0.336 0.75-0.75v0-13.25h26.5v13.25c0 0.414 0.336 0.75 0.75 0.75s0.75-0.336 0.75-0.75v0-14c-0-0.414-0.336-0.75-0.75-0.75v0z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">Access to Global Peer Community</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Layer_1" viewBox="0 0 512.001 512.001" xml:space="preserve" stroke="#0634A1" stroke-width="7.168014000000001"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <g> <path d="M478.329,183.82H300.803c-7.9-27.511-23.412-52.593-45.133-72.042c-32.922-29.481-75.446-43.016-119.749-38.119 C64.871,81.518,8.048,138.871,0.809,210.032c-3.953,38.846,6.67,77.251,29.909,108.14c22.271,29.6,54.229,50.063,90.203,57.816 l37.845,37.844c3.177,3.178,7.395,4.861,11.698,4.86c2.138,0,4.296-0.416,6.358-1.27c6.214-2.574,10.227-8.582,10.227-15.307 V375.62c6.223-1.391,12.285-3.155,18.172-5.257v1.05c0,18.566,15.105,33.671,33.671,33.671h56.539l30.119,30.119 c2.694,2.694,6.269,4.121,9.916,4.121c1.812,0,3.641-0.353,5.389-1.076c5.267-2.182,8.67-7.275,8.67-12.976v-20.188H478.33 c18.566,0,33.671-15.105,33.671-33.671V217.489C512,198.925,496.895,183.82,478.329,183.82z M177.625,361.164 c-3.825,0.682-6.609,4.007-6.609,7.892v33.06c0,0.191,0,0.357-0.33,0.494c-0.33,0.135-0.446,0.019-0.583-0.115l-39.539-39.539 c-1.121-1.121-2.55-1.886-4.106-2.194c-33.084-6.575-62.535-25.124-82.928-52.229c-20.805-27.654-30.313-62.059-26.771-96.878 c3.121-30.685,17.014-59.873,39.119-82.19c22.109-22.32,51.16-36.479,81.805-39.868c5.332-0.59,10.628-0.882,15.885-0.882 c33.893,0,65.884,12.154,91.405,35.007c29.082,26.042,45.761,63.35,45.761,102.359 C290.735,292.663,243.166,349.473,177.625,361.164z M495.966,371.414c0,9.725-7.912,17.637-17.637,17.637H341.508 c-4.427,0-8.017,3.589-8.017,8.017v23.403l-29.071-29.071c-1.503-1.504-3.542-2.348-5.668-2.348h-59.859 c-9.725,0-17.637-7.912-17.637-17.637v-7.818c51.32-25.224,85.513-77.856,85.513-137.515c0-8.852-0.781-17.622-2.28-26.228 h173.841c9.725,0,17.637,7.912,17.637,17.637V371.414z"></path> </g> </g> <g> <g> <path d="M449.792,246.027c-3.13-3.131-8.206-3.131-11.337,0l-79.845,79.845l-37.069-37.069c-3.131-3.131-8.207-3.131-11.337,0 c-3.131,3.131-3.131,8.207,0,11.337l42.737,42.737c1.565,1.565,3.617,2.348,5.668,2.348c2.051,0,4.104-0.782,5.669-2.348 l85.513-85.513C452.923,254.233,452.923,249.157,449.792,246.027z"></path> </g> </g> <g> <g> <path d="M153.385,286.464c-0.003,0-0.007,0-0.011,0c-4.427,0-8.022,3.595-8.022,8.022c0,0.001,0,0.003,0,0.005 c0,0.002,0,0.003,0,0.005c0,4.427,3.595,8.022,8.022,8.022c0.003,0,0.008,0,0.011,0c4.427,0,8.022-3.595,8.022-8.022 c0-0.001,0-0.003,0-0.005c0-0.002,0-0.003,0-0.005C161.407,290.059,157.812,286.464,153.385,286.464z"></path> </g> </g> <g> <g> <path d="M189.094,164.713c-9.712-9.712-22.397-15.06-35.719-15.059c-27.994,0.002-50.769,22.78-50.769,50.773 c0,4.427,3.589,8.017,8.017,8.017c4.427,0,8.017-3.589,8.017-8.017c0-19.154,15.583-34.739,34.737-34.74 c9.039,0,17.697,3.679,24.38,10.362c6.683,6.683,10.363,15.342,10.363,24.381c-0.001,15.227-10.176,28.911-24.742,33.279 c-10.776,3.231-18.014,12.886-18.014,24.024v2.554c0,4.427,3.589,8.017,8.017,8.017c4.427,0,8.017-3.589,8.017-8.017v-2.554 c0-4.002,2.647-7.485,6.587-8.666c21.295-6.386,36.169-26.385,36.17-48.636C204.154,187.11,198.806,174.424,189.094,164.713z"></path> </g> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">Topic-wise Quizzes</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 24 24"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><g id="Repeat"><path d="M2.078,17.562c-0.01,-0.039 -0.016,-0.08 -0.016,-0.123c0,-0.138 0.056,-0.263 0.147,-0.353c0.008,-0.009 1.416,-1.417 2,-2c0.198,-0.198 0.507,-0.183 0.707,-0c0.199,0.183 0.185,0.522 -0,0.707l-1.147,1.146l15.669,0c0.828,0 1.5,-0.671 1.5,-1.5l0,-3.439c0,-0.276 0.224,-0.5 0.5,-0.5c0.276,0 0.5,0.224 0.5,0.5l0,3.439c0,1.381 -1.12,2.5 -2.5,2.5l-15.669,0l1.147,1.147c0.198,0.198 0.183,0.507 -0,0.707c-0.183,0.199 -0.522,0.185 -0.707,-0l-2,-2c-0.066,-0.063 -0.11,-0.143 -0.131,-0.231Zm19.845,-11.105c0.01,0.039 0.015,0.08 0.015,0.122c0,0.138 -0.056,0.263 -0.147,0.354c-0.008,0.008 -1.416,1.417 -2,2c-0.197,0.198 -0.507,0.183 -0.707,-0c-0.199,-0.183 -0.185,-0.522 0,-0.707l1.147,-1.147l-15.669,0c-0.828,0 -1.5,0.672 -1.5,1.5l0,3.439c-0,0.276 -0.224,0.5 -0.5,0.5c-0.276,0 -0.5,-0.224 -0.5,-0.5l0,-3.439c0,-1.381 1.12,-2.5 2.5,-2.5l15.669,0l-1.146,-1.146c-0.198,-0.198 -0.183,-0.507 -0,-0.707c0.183,-0.199 0.522,-0.185 0.707,-0l2,2c0.065,0.063 0.11,0.143 0.131,0.231Z"></path></g></g></svg>						</span>
										<span class="elementor-icon-list-text">Interview Prep Material</span>
									</li>
						</ul>
						</div>
				</div>
		<div class="elementor-element elementor-element-a3a97ee e-con-full e-flex e-con e-child" data-id="a3a97ee" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-e6398d7 elementor-widget__width-initial elementor-widget elementor-widget-heading" data-id="e6398d7" data-element_type="widget" data-e-type="widget" data-widget_type="heading.default">
				<div class="elementor-widget-container">
					<h2 class="elementor-heading-title elementor-size-default"><p><span style="font-size: 13px;color: black">Buy for </span><span style="font-size: 16px;color: #63b7fd;font-weight: bold">40% OFF</span><br />
<span style="font-size: 13px;color: gray;text-decoration: line-through">₹9,999.00</span><span style="font-size: 17px;color: black;font-weight: bold"> ₹5,999.00</span></p>
</h2>				</div>
				</div>
				<div class="elementor-element elementor-element-856e4c2 elementor-mobile-align-right elementor-widget-mobile__width-initial elementor-widget elementor-widget-button" data-id="856e4c2" data-element_type="widget" data-e-type="widget" data-widget_type="button.default">
				<div class="elementor-widget-container">
									<div class="elementor-button-wrapper">
					<a class="elementor-button elementor-button-link elementor-size-sm" href="https://getsdeready.com/courses/dsa/">
						<span class="elementor-button-content-wrapper">
									<span class="elementor-button-text">Learn More</span>
					</span>
					</a>
				</div>
								</div>
				</div>
				</div>
					</div>
				</div>
				</div>
				<div data-elementor-type="loop-item" data-elementor-id="30707" class="elementor elementor-30707 swiper-slide e-loop-item e-loop-item-37750 post-37750 courses type-courses status-publish has-post-thumbnail hentry course-category-dsa" data-elementor-post-type="elementor_library" role="group" aria-roledescription="slide" data-custom-edit-handle="1">
			<div class="elementor-element elementor-element-3bfce03 e-flex e-con-boxed e-con e-parent" data-id="3bfce03" data-element_type="container" data-e-type="container" data-settings="{&quot;background_background&quot;:&quot;classic&quot;}">
					<div class="e-con-inner">
				<div class="elementor-element elementor-element-62ff770 elementor-widget elementor-widget-theme-post-featured-image elementor-widget-image" data-id="62ff770" data-element_type="widget" data-e-type="widget" data-widget_type="theme-post-featured-image.default">
				<div class="elementor-widget-container">
															<img loading="lazy" decoding="async" width="1600" height="1125" src="https://getsdeready.com/wp-content/uploads/2025/08/WhatsApp-Image-2025-08-13-at-14.35.47_7dc4ea98.webp" class="attachment-full size-full wp-image-44142" alt="" srcset="https://getsdeready.com/wp-content/uploads/2025/08/WhatsApp-Image-2025-08-13-at-14.35.47_7dc4ea98.webp 1600w, https://getsdeready.com/wp-content/uploads/2025/08/WhatsApp-Image-2025-08-13-at-14.35.47_7dc4ea98-300x211.webp 300w, https://getsdeready.com/wp-content/uploads/2025/08/WhatsApp-Image-2025-08-13-at-14.35.47_7dc4ea98-1024x720.webp 1024w, https://getsdeready.com/wp-content/uploads/2025/08/WhatsApp-Image-2025-08-13-at-14.35.47_7dc4ea98-768x540.webp 768w, https://getsdeready.com/wp-content/uploads/2025/08/WhatsApp-Image-2025-08-13-at-14.35.47_7dc4ea98-1536x1080.webp 1536w, https://getsdeready.com/wp-content/uploads/2025/08/WhatsApp-Image-2025-08-13-at-14.35.47_7dc4ea98-50x35.webp 50w, https://getsdeready.com/wp-content/uploads/2025/08/WhatsApp-Image-2025-08-13-at-14.35.47_7dc4ea98-100x70.webp 100w, https://getsdeready.com/wp-content/uploads/2025/08/WhatsApp-Image-2025-08-13-at-14.35.47_7dc4ea98-600x422.webp 600w, https://getsdeready.com/wp-content/uploads/2025/08/WhatsApp-Image-2025-08-13-at-14.35.47_7dc4ea98-71x50.webp 71w" sizes="(max-width: 1600px) 100vw, 1600px" />															</div>
				</div>
				<div class="elementor-element elementor-element-fb51e5c elementor-widget elementor-widget-heading" data-id="fb51e5c" data-element_type="widget" data-e-type="widget" data-widget_type="heading.default">
				<div class="elementor-widget-container">
					<h2 class="elementor-heading-title elementor-size-default">Data Analytics</h2>				</div>
				</div>
				<div class="elementor-element elementor-element-716c418 elementor-icon-list--layout-traditional elementor-list-item-link-full_width elementor-widget elementor-widget-icon-list" data-id="716c418" data-element_type="widget" data-e-type="widget" data-widget_type="icon-list.default">
				<div class="elementor-widget-container">
							<ul class="elementor-icon-list-items">
							<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><title>video-camera</title><path d="M30.395 6.362c-0.112-0.071-0.248-0.113-0.395-0.113-0.122 0-0.238 0.030-0.34 0.082l0.004-0.002-6.938 3.468c-0.106-1.426-1.287-2.543-2.729-2.548h-15.996c-1.518 0.002-2.748 1.232-2.75 2.75v12.001c0.002 1.518 1.232 2.748 2.75 2.75h15.996c1.443-0.005 2.623-1.122 2.729-2.538l0.001-0.009 6.939 3.468c0.097 0.050 0.211 0.080 0.333 0.080 0.001 0 0.002 0 0.003 0h-0c0.001 0 0.001 0 0.002 0 0.413 0 0.748-0.335 0.748-0.748 0-0.001 0-0.001 0-0.002v0-18c-0-0.268-0.141-0.503-0.352-0.636l-0.003-0.002zM21.246 22c-0.001 0.69-0.56 1.249-1.25 1.25h-15.996c-0.69-0.001-1.249-0.56-1.25-1.25v-12.001c0.001-0.69 0.56-1.249 1.25-1.25h15.996c0.69 0.001 1.249 0.56 1.25 1.25v12.001zM29.25 23.787l-6.504-3.25v-9.073l6.504-3.251z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">20+ Live Classes &amp; Recordings</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32" data-name="Layer 1" id="Layer_1" stroke="#0634A1" stroke-width="0.16"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><path d="M18,6V7H17a1,1,0,0,1-1-1V4h1V6Z"></path><path d="M17,6V7h1a1,1,0,0,0,1-1V4H18V6Z"></path><path d="M18,2V1H17a1,1,0,0,0-1,1V3h1V2Z"></path><path d="M17,2V1h1a1,1,0,0,1,1,1V4H18V2Z"></path><rect height="1" transform="translate(27 53) rotate(180)" width="19" x="4" y="26"></rect><rect height="1" transform="translate(32 59) rotate(180)" width="18" x="7" y="29"></rect><rect height="1" transform="translate(42 -13) rotate(90)" width="21" x="17" y="14"></rect><rect height="1" transform="translate(22.5 7.5) rotate(90)" width="22" x="-3.5" y="14.5"></rect><path d="M28,25H27v2a2,2,0,0,1-2,2h0v1h0a3,3,0,0,0,3-3Z"></path><path d="M22,26h1v1a2,2,0,0,0,2,2h0v1h0a3,3,0,0,1-3-3Z"></path><path d="M4,26H5v1a2,2,0,0,0,2,2H8v1H7a3,3,0,0,1-3-3Z"></path><rect height="1" width="17" x="9" y="2"></rect><path d="M25,2V3h1a1,1,0,0,1,1,1V5h1V4a2,2,0,0,0-2-2Z"></path><path d="M10,2V3H9A1,1,0,0,0,8,4V5H7V4A2,2,0,0,1,9,2Z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">24*7 Live Doubt Support</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Capa_1" viewBox="0 0 442 442" xml:space="preserve"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <path d="M179.046,93.365h84.845c2.761,0,5-2.239,5-5s-2.239-5-5-5h-84.845c-2.761,0-5,2.239-5,5S176.285,93.365,179.046,93.365z"></path> <path d="M122.977,120.046H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,120.046,122.977,120.046z "></path> <path d="M122.977,146.728H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,146.728,122.977,146.728z "></path> <path d="M122.977,173.409H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,173.409,122.977,173.409z "></path> <path d="M122.977,200.091H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,200.091,122.977,200.091z "></path> <path d="M122.977,226.772H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,226.772,122.977,226.772z "></path> <path d="M122.977,253.454H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,253.454,122.977,253.454z "></path> <path d="M122.977,280.135H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,280.135,122.977,280.135z "></path> <path d="M122.977,306.816H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,306.816,122.977,306.816z "></path> <path d="M232.008,323.498H122.977c-2.761,0-5,2.239-5,5s2.239,5,5,5h109.031c2.761,0,5-2.239,5-5S234.769,323.498,232.008,323.498z "></path> <path d="M385.536,68.464l-67-67C317.598,0.527,316.326,0,315,0H60c-2.761,0-5,2.239-5,5v432c0,2.761,2.239,5,5,5h322 c2.761,0,5-2.239,5-5V72C387,70.674,386.473,69.402,385.536,68.464z M320,17.071L369.929,67H320V17.071z M65,432V10h245v62 c0,2.761,2.239,5,5,5h62v355H65z"></path> <path d="M329.39,357.142c-0.717-1.979-2.596-3.298-4.702-3.298s-3.985,1.319-4.702,3.298l-15.366,42.453 c-0.939,2.597,0.403,5.463,3,6.403c0.562,0.203,1.136,0.3,1.701,0.3c2.046,0,3.966-1.265,4.702-3.3l4.001-11.055h13.326 l4.001,11.055c0.94,2.596,3.805,3.938,6.403,3c2.597-0.94,3.939-3.807,3-6.403L329.39,357.142z M321.645,381.943l3.043-8.409 l3.044,8.409H321.645z"></path> <path d="M342.466,304.771l-83.996,83.996c-1.953,1.953-1.953,5.119,0,7.071c0.977,0.976,2.256,1.464,3.536,1.464 s2.559-0.488,3.536-1.464l83.996-83.996c1.953-1.953,1.953-5.119,0-7.071C347.584,302.819,344.419,302.819,342.466,304.771z"></path> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">15+ Hands-on Live Projects</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 24 24"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><path d="M20,6.52797748 L20,19.5 C20,20.8807119 18.8807119,22 17.5,22 L6.5,22 C5.11928813,22 4,20.8807119 4,19.5 L4,4.5 C4,3.11928813 5.11928813,2 6.5,2 L15.4720225,2 C15.6047688,1.99158053 15.7429463,2.03583949 15.8535534,2.14644661 L19.8535534,6.14644661 C19.9641605,6.25705373 20.0084195,6.39523125 20,6.52797748 Z M15,3 L6.5,3 C5.67157288,3 5,3.67157288 5,4.5 L5,19.5 C5,20.3284271 5.67157288,21 6.5,21 L17.5,21 C18.3284271,21 19,20.3284271 19,19.5 L19,7 L15.5,7 C15.2238576,7 15,6.77614237 15,6.5 L15,3 Z M16,3.70710678 L16,6 L18.2928932,6 L16,3.70710678 Z M12,16.2928932 L14.1464466,14.1464466 C14.3417088,13.9511845 14.6582912,13.9511845 14.8535534,14.1464466 C15.0488155,14.3417088 15.0488155,14.6582912 14.8535534,14.8535534 L11.9198269,17.7872799 C11.8307203,17.9246987 11.6759769,18.0156098 11.5,18.0156098 C11.3240231,18.0156098 11.1692797,17.9246987 11.0801731,17.7872799 L8.14644661,14.8535534 C7.95118446,14.6582912 7.95118446,14.3417088 8.14644661,14.1464466 C8.34170876,13.9511845 8.65829124,13.9511845 8.85355339,14.1464466 L11,16.2928932 L11,9.5 C11,9.22385763 11.2238576,9 11.5,9 C11.7761424,9 12,9.22385763 12,9.5 L12,16.2928932 L12,16.2928932 Z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">Comprehensive Notes</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Capa_1" viewBox="0 0 394.497 394.497" xml:space="preserve"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <path d="M181.239,84.373c-30.412,30.413-30.412,79.896,0,110.309c15.206,15.206,35.18,22.809,55.154,22.809 s39.948-7.603,55.154-22.809c30.412-30.413,30.412-79.896,0-110.309C261.136,53.961,211.651,53.961,181.239,84.373z M295,174.026 v-68.998C307.48,126.239,307.48,152.817,295,174.026z M285,91.994v95.067c-0.177,0.181-0.343,0.37-0.522,0.55 c-26.514,26.512-69.652,26.514-96.168,0c-3.953-3.953-7.302-8.281-10.076-12.862H184c2.762,0,5-2.239,5-5s-2.238-5-5-5h-10.747 c-3.926-9.869-5.447-20.475-4.576-30.92H208c2.762,0,5-2.239,5-5s-2.238-5-5-5h-37.742c2.653-11.26,8.213-21.961,16.66-30.92H251 c2.762,0,5-2.239,5-5s-2.238-5-5-5h-52.269c11.361-7.562,24.51-11.349,37.662-11.349c17.413,0,34.827,6.628,48.084,19.885 C284.657,91.624,284.823,91.813,285,91.994z"></path> <path d="M389.225,266.902l-72.44-72.44c11.022-16.057,16.958-35.038,16.958-54.935c0-26.002-10.127-50.449-28.514-68.835 c-7.583-7.583-16.125-13.624-25.229-18.177V7.749c0-2.761-2.238-5-5-5H55.69c-1.326,0-2.598,0.527-3.535,1.464l-50.69,50.68 C0.527,55.831,0,57.103,0,58.429v328.32c0,2.761,2.238,5,5,5h270c2.762,0,5-2.239,5-5V226.54c3.882-1.941,7.658-4.157,11.303-6.649 l72.467,72.467c3.509,3.509,8.117,5.264,12.728,5.264c4.608,0,9.219-1.755,12.728-5.264c3.4-3.399,5.272-7.92,5.272-12.728 C394.497,274.822,392.625,270.302,389.225,266.902z M323.742,139.527c0,23.332-9.086,45.267-25.584,61.764 c-34.059,34.058-89.471,34.057-123.529,0c-16.498-16.498-25.584-38.433-25.584-61.764s9.086-45.267,25.584-61.764 c17.029-17.028,39.396-25.542,61.765-25.542s44.735,8.514,61.765,25.542C314.656,94.261,323.742,116.196,323.742,139.527z M50.69,19.817v33.611H17.073L50.69,19.817z M270,381.749H10V63.429h45.69c2.762,0,5-2.239,5-5v-45.68H270v35.448 c-34.511-12.638-74.79-5.156-102.441,22.496c-6.161,6.161-11.389,13.005-15.625,20.357h-46.932c-2.762,0-5,2.239-5,5s2.238,5,5,5 h41.922c-2.822,6.557-4.91,13.424-6.224,20.5H48.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h90.871c-0.213,2.64-0.326,5.301-0.326,7.979 c0,4.222,0.271,8.401,0.797,12.521H93c-2.762,0-5,2.239-5,5s2.238,5,5,5h48.656c1.676,7.109,4.145,13.978,7.364,20.5H48.5 c-2.762,0-5,2.239-5,5s2.238,5,5,5h106.222c3.678,5.64,7.964,10.941,12.836,15.814c1.642,1.642,3.343,3.186,5.07,4.686H155.5 c-2.762,0-5,2.239-5,5s2.238,5,5,5h30.89c15.335,9.179,32.667,13.781,50.004,13.781c11.394,0,22.781-2.006,33.606-5.971V381.749z M305.229,208.363c1.899-1.899,3.705-3.866,5.426-5.89l51.275,51.275l-11.314,11.314l-51.295-51.295 C301.341,212.053,303.322,210.269,305.229,208.363z M382.154,285.287c-3.119,3.119-8.195,3.119-11.314,0l-13.154-13.154 L369,260.819l13.154,13.154c1.511,1.511,2.343,3.52,2.343,5.657S383.665,283.776,382.154,285.287z"></path> <path d="M48.5,101.049h40.001c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,101.049,48.5,101.049z"></path> <path d="M48.5,162.049h27.501c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,162.049,48.5,162.049z"></path> <path d="M48.5,223.049h92.301c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,223.049,48.5,223.049z"></path> <path d="M231.5,243.549H86.501c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,243.549,231.5,243.549z"></path> <path d="M48.5,253.549h22.001c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,253.549,48.5,253.549z"></path> <path d="M231.5,304.549h-94.499c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,304.549,231.5,304.549z"></path> <path d="M48.5,314.549h72.801c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,314.549,48.5,314.549z"></path> <path d="M231.5,335.049H178c-2.762,0-5,2.239-5,5s2.238,5,5,5h53.5c2.762,0,5-2.239,5-5S234.262,335.049,231.5,335.049z"></path> <path d="M163.101,335.049h-89.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h89.5c2.762,0,5-2.239,5-5S165.862,335.049,163.101,335.049z"></path> <path d="M58.501,335.049H48.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h10.001c2.762,0,5-2.239,5-5S61.263,335.049,58.501,335.049z"></path> <path d="M231.5,274.049h-30.499c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,274.049,231.5,274.049z"></path> <path d="M48.5,284.049h135c2.762,0,5-2.239,5-5s-2.238-5-5-5h-135c-2.762,0-5,2.239-5,5S45.738,284.049,48.5,284.049z"></path> <path d="M251,123.829h-17.5c-2.762,0-5,2.239-5,5s2.238,5,5,5H251c2.762,0,5-2.239,5-5S253.762,123.829,251,123.829z"></path> <path d="M251,164.749h-46c-2.762,0-5,2.239-5,5s2.238,5,5,5h46c2.762,0,5-2.239,5-5S253.762,164.749,251,164.749z"></path> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">Real-world Tools &amp; Technologies</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><title>screen-users</title><path d="M9.74 21c-0.001-1.721-1.396-3.115-3.116-3.115s-3.116 1.395-3.116 3.116 1.395 3.116 3.116 3.116v0c1.721-0.002 3.115-1.397 3.116-3.117v-0zM5.008 21c0.001-0.892 0.724-1.615 1.616-1.615s1.616 0.724 1.616 1.616-0.724 1.616-1.616 1.616c0 0 0 0-0 0v0c-0.893-0.001-1.616-0.724-1.616-1.617v-0zM19.117 21c-0-1.721-1.396-3.116-3.117-3.116s-3.117 1.395-3.117 3.117c0 1.721 1.395 3.116 3.116 3.117h0c1.721-0.002 3.115-1.396 3.117-3.117v-0zM14.384 21c0-0.893 0.724-1.616 1.617-1.616s1.617 0.724 1.617 1.617-0.724 1.617-1.617 1.617c-0 0-0 0-0.001 0h0c-0.893-0.001-1.616-0.724-1.616-1.617v-0zM28.492 21c-0.001-1.721-1.396-3.115-3.116-3.115s-3.116 1.395-3.116 3.116 1.395 3.116 3.116 3.116c0 0 0.001 0 0.001 0h-0c1.72-0.003 3.113-1.397 3.115-3.117v-0zM23.76 21c0.001-0.892 0.724-1.615 1.616-1.615s1.616 0.724 1.616 1.616c0 0.892-0.723 1.616-1.615 1.616h-0c-0.893-0-1.617-0.724-1.617-1.617v-0zM25.377 25.531c-1.979 0.011-3.71 1.061-4.675 2.633l-0.014 0.024c-0.972-1.603-2.707-2.657-4.688-2.657s-3.717 1.055-4.675 2.633l-0.014 0.024c-0.974-1.603-2.711-2.657-4.695-2.657-2.611 0-4.794 1.827-5.343 4.272l-0.007 0.037c-0.011 0.048-0.017 0.103-0.017 0.16 0 0.414 0.336 0.75 0.75 0.75 0.357 0 0.656-0.25 0.731-0.585l0.001-0.005c0.406-1.803 1.994-3.129 3.891-3.129s3.485 1.326 3.886 3.102l0.005 0.027c0.076 0.339 0.375 0.589 0.731 0.59h0c0.021 0 0.044-0.005 0.065-0.007 0.022 0.002 0.044 0.007 0.065 0.007 0 0 0 0 0 0 0.357 0 0.656-0.25 0.73-0.585l0.001-0.005c0.406-1.803 1.994-3.129 3.891-3.129s3.485 1.326 3.886 3.102l0.005 0.027c0.115 0.337 0.428 0.574 0.797 0.574s0.682-0.238 0.795-0.568l0.002-0.006c0.407-1.803 1.994-3.129 3.892-3.129s3.485 1.326 3.887 3.102l0.005 0.027c0.076 0.34 0.374 0.59 0.732 0.59 0 0 0.001 0 0.001 0h-0c0.057-0 0.112-0.007 0.165-0.019l-0.005 0.001c0.34-0.076 0.59-0.375 0.59-0.733 0-0.057-0.006-0.112-0.018-0.165l0.001 0.005c-0.568-2.476-2.747-4.297-5.354-4.309h-0.001zM30 1.25h-28c-0.414 0-0.75 0.336-0.75 0.75v0 14c0 0.414 0.336 0.75 0.75 0.75s0.75-0.336 0.75-0.75v0-13.25h26.5v13.25c0 0.414 0.336 0.75 0.75 0.75s0.75-0.336 0.75-0.75v0-14c-0-0.414-0.336-0.75-0.75-0.75v0z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">Access to Global Peer Community</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Layer_1" viewBox="0 0 512.001 512.001" xml:space="preserve" stroke="#0634A1" stroke-width="7.168014000000001"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <g> <path d="M478.329,183.82H300.803c-7.9-27.511-23.412-52.593-45.133-72.042c-32.922-29.481-75.446-43.016-119.749-38.119 C64.871,81.518,8.048,138.871,0.809,210.032c-3.953,38.846,6.67,77.251,29.909,108.14c22.271,29.6,54.229,50.063,90.203,57.816 l37.845,37.844c3.177,3.178,7.395,4.861,11.698,4.86c2.138,0,4.296-0.416,6.358-1.27c6.214-2.574,10.227-8.582,10.227-15.307 V375.62c6.223-1.391,12.285-3.155,18.172-5.257v1.05c0,18.566,15.105,33.671,33.671,33.671h56.539l30.119,30.119 c2.694,2.694,6.269,4.121,9.916,4.121c1.812,0,3.641-0.353,5.389-1.076c5.267-2.182,8.67-7.275,8.67-12.976v-20.188H478.33 c18.566,0,33.671-15.105,33.671-33.671V217.489C512,198.925,496.895,183.82,478.329,183.82z M177.625,361.164 c-3.825,0.682-6.609,4.007-6.609,7.892v33.06c0,0.191,0,0.357-0.33,0.494c-0.33,0.135-0.446,0.019-0.583-0.115l-39.539-39.539 c-1.121-1.121-2.55-1.886-4.106-2.194c-33.084-6.575-62.535-25.124-82.928-52.229c-20.805-27.654-30.313-62.059-26.771-96.878 c3.121-30.685,17.014-59.873,39.119-82.19c22.109-22.32,51.16-36.479,81.805-39.868c5.332-0.59,10.628-0.882,15.885-0.882 c33.893,0,65.884,12.154,91.405,35.007c29.082,26.042,45.761,63.35,45.761,102.359 C290.735,292.663,243.166,349.473,177.625,361.164z M495.966,371.414c0,9.725-7.912,17.637-17.637,17.637H341.508 c-4.427,0-8.017,3.589-8.017,8.017v23.403l-29.071-29.071c-1.503-1.504-3.542-2.348-5.668-2.348h-59.859 c-9.725,0-17.637-7.912-17.637-17.637v-7.818c51.32-25.224,85.513-77.856,85.513-137.515c0-8.852-0.781-17.622-2.28-26.228 h173.841c9.725,0,17.637,7.912,17.637,17.637V371.414z"></path> </g> </g> <g> <g> <path d="M449.792,246.027c-3.13-3.131-8.206-3.131-11.337,0l-79.845,79.845l-37.069-37.069c-3.131-3.131-8.207-3.131-11.337,0 c-3.131,3.131-3.131,8.207,0,11.337l42.737,42.737c1.565,1.565,3.617,2.348,5.668,2.348c2.051,0,4.104-0.782,5.669-2.348 l85.513-85.513C452.923,254.233,452.923,249.157,449.792,246.027z"></path> </g> </g> <g> <g> <path d="M153.385,286.464c-0.003,0-0.007,0-0.011,0c-4.427,0-8.022,3.595-8.022,8.022c0,0.001,0,0.003,0,0.005 c0,0.002,0,0.003,0,0.005c0,4.427,3.595,8.022,8.022,8.022c0.003,0,0.008,0,0.011,0c4.427,0,8.022-3.595,8.022-8.022 c0-0.001,0-0.003,0-0.005c0-0.002,0-0.003,0-0.005C161.407,290.059,157.812,286.464,153.385,286.464z"></path> </g> </g> <g> <g> <path d="M189.094,164.713c-9.712-9.712-22.397-15.06-35.719-15.059c-27.994,0.002-50.769,22.78-50.769,50.773 c0,4.427,3.589,8.017,8.017,8.017c4.427,0,8.017-3.589,8.017-8.017c0-19.154,15.583-34.739,34.737-34.74 c9.039,0,17.697,3.679,24.38,10.362c6.683,6.683,10.363,15.342,10.363,24.381c-0.001,15.227-10.176,28.911-24.742,33.279 c-10.776,3.231-18.014,12.886-18.014,24.024v2.554c0,4.427,3.589,8.017,8.017,8.017c4.427,0,8.017-3.589,8.017-8.017v-2.554 c0-4.002,2.647-7.485,6.587-8.666c21.295-6.386,36.169-26.385,36.17-48.636C204.154,187.11,198.806,174.424,189.094,164.713z"></path> </g> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">Interview Prep Material</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 24 24"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><g id="Repeat"><path d="M2.078,17.562c-0.01,-0.039 -0.016,-0.08 -0.016,-0.123c0,-0.138 0.056,-0.263 0.147,-0.353c0.008,-0.009 1.416,-1.417 2,-2c0.198,-0.198 0.507,-0.183 0.707,-0c0.199,0.183 0.185,0.522 -0,0.707l-1.147,1.146l15.669,0c0.828,0 1.5,-0.671 1.5,-1.5l0,-3.439c0,-0.276 0.224,-0.5 0.5,-0.5c0.276,0 0.5,0.224 0.5,0.5l0,3.439c0,1.381 -1.12,2.5 -2.5,2.5l-15.669,0l1.147,1.147c0.198,0.198 0.183,0.507 -0,0.707c-0.183,0.199 -0.522,0.185 -0.707,-0l-2,-2c-0.066,-0.063 -0.11,-0.143 -0.131,-0.231Zm19.845,-11.105c0.01,0.039 0.015,0.08 0.015,0.122c0,0.138 -0.056,0.263 -0.147,0.354c-0.008,0.008 -1.416,1.417 -2,2c-0.197,0.198 -0.507,0.183 -0.707,-0c-0.199,-0.183 -0.185,-0.522 0,-0.707l1.147,-1.147l-15.669,0c-0.828,0 -1.5,0.672 -1.5,1.5l0,3.439c-0,0.276 -0.224,0.5 -0.5,0.5c-0.276,0 -0.5,-0.224 -0.5,-0.5l0,-3.439c0,-1.381 1.12,-2.5 2.5,-2.5l15.669,0l-1.146,-1.146c-0.198,-0.198 -0.183,-0.507 -0,-0.707c0.183,-0.199 0.522,-0.185 0.707,-0l2,2c0.065,0.063 0.11,0.143 0.131,0.231Z"></path></g></g></svg>						</span>
										<span class="elementor-icon-list-text">Placement Assistance</span>
									</li>
						</ul>
						</div>
				</div>
		<div class="elementor-element elementor-element-a3a97ee e-con-full e-flex e-con e-child" data-id="a3a97ee" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-e6398d7 elementor-widget__width-initial elementor-widget elementor-widget-heading" data-id="e6398d7" data-element_type="widget" data-e-type="widget" data-widget_type="heading.default">
				<div class="elementor-widget-container">
					<h2 class="elementor-heading-title elementor-size-default"><p><span style="font-size: 13px;color: black">Buy for </span><span style="font-size: 16px;color: #63b7fd;font-weight: bold">70% OFF</span><br />
<span style="font-size: 13px;color: gray;text-decoration: line-through">₹9,999.00</span><span style="font-size: 17px;color: black;font-weight: bold"> ₹2,999.00</span></p>
</h2>				</div>
				</div>
				<div class="elementor-element elementor-element-856e4c2 elementor-mobile-align-right elementor-widget-mobile__width-initial elementor-widget elementor-widget-button" data-id="856e4c2" data-element_type="widget" data-e-type="widget" data-widget_type="button.default">
				<div class="elementor-widget-container">
									<div class="elementor-button-wrapper">
					<a class="elementor-button elementor-button-link elementor-size-sm" href="https://getsdeready.com/courses/data-analytics/">
						<span class="elementor-button-content-wrapper">
									<span class="elementor-button-text">Learn More</span>
					</span>
					</a>
				</div>
								</div>
				</div>
				</div>
					</div>
				</div>
				</div>
				<div data-elementor-type="loop-item" data-elementor-id="30707" class="elementor elementor-30707 swiper-slide e-loop-item e-loop-item-570 post-570 courses type-courses status-publish has-post-thumbnail hentry course-category-featured course-tag-development course-tag-programming course-tag-systemdesign" data-elementor-post-type="elementor_library" role="group" aria-roledescription="slide" data-custom-edit-handle="1">
			<div class="elementor-element elementor-element-3bfce03 e-flex e-con-boxed e-con e-parent" data-id="3bfce03" data-element_type="container" data-e-type="container" data-settings="{&quot;background_background&quot;:&quot;classic&quot;}">
					<div class="e-con-inner">
				<div class="elementor-element elementor-element-62ff770 elementor-widget elementor-widget-theme-post-featured-image elementor-widget-image" data-id="62ff770" data-element_type="widget" data-e-type="widget" data-widget_type="theme-post-featured-image.default">
				<div class="elementor-widget-container">
															<img loading="lazy" decoding="async" width="768" height="432" src="https://getsdeready.com/wp-content/uploads/2024/08/Copy-of-Website-banners-for-getsdeready-768-x-432-px_20240812_161147_0000-min.png" class="attachment-full size-full wp-image-18789" alt="" srcset="https://getsdeready.com/wp-content/uploads/2024/08/Copy-of-Website-banners-for-getsdeready-768-x-432-px_20240812_161147_0000-min.png 768w, https://getsdeready.com/wp-content/uploads/2024/08/Copy-of-Website-banners-for-getsdeready-768-x-432-px_20240812_161147_0000-min-300x169.png 300w, https://getsdeready.com/wp-content/uploads/2024/08/Copy-of-Website-banners-for-getsdeready-768-x-432-px_20240812_161147_0000-min-160x90.png 160w, https://getsdeready.com/wp-content/uploads/2024/08/Copy-of-Website-banners-for-getsdeready-768-x-432-px_20240812_161147_0000-min-600x338.png 600w, https://getsdeready.com/wp-content/uploads/2024/08/Copy-of-Website-banners-for-getsdeready-768-x-432-px_20240812_161147_0000-min-89x50.png 89w" sizes="(max-width: 768px) 100vw, 768px" />															</div>
				</div>
				<div class="elementor-element elementor-element-fb51e5c elementor-widget elementor-widget-heading" data-id="fb51e5c" data-element_type="widget" data-e-type="widget" data-widget_type="heading.default">
				<div class="elementor-widget-container">
					<h2 class="elementor-heading-title elementor-size-default">Fast-Track to Full Spectrum Software Engineering</h2>				</div>
				</div>
				<div class="elementor-element elementor-element-716c418 elementor-icon-list--layout-traditional elementor-list-item-link-full_width elementor-widget elementor-widget-icon-list" data-id="716c418" data-element_type="widget" data-e-type="widget" data-widget_type="icon-list.default">
				<div class="elementor-widget-container">
							<ul class="elementor-icon-list-items">
							<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><title>video-camera</title><path d="M30.395 6.362c-0.112-0.071-0.248-0.113-0.395-0.113-0.122 0-0.238 0.030-0.34 0.082l0.004-0.002-6.938 3.468c-0.106-1.426-1.287-2.543-2.729-2.548h-15.996c-1.518 0.002-2.748 1.232-2.75 2.75v12.001c0.002 1.518 1.232 2.748 2.75 2.75h15.996c1.443-0.005 2.623-1.122 2.729-2.538l0.001-0.009 6.939 3.468c0.097 0.050 0.211 0.080 0.333 0.080 0.001 0 0.002 0 0.003 0h-0c0.001 0 0.001 0 0.002 0 0.413 0 0.748-0.335 0.748-0.748 0-0.001 0-0.001 0-0.002v0-18c-0-0.268-0.141-0.503-0.352-0.636l-0.003-0.002zM21.246 22c-0.001 0.69-0.56 1.249-1.25 1.25h-15.996c-0.69-0.001-1.249-0.56-1.25-1.25v-12.001c0.001-0.69 0.56-1.249 1.25-1.25h15.996c0.69 0.001 1.249 0.56 1.25 1.25v12.001zM29.25 23.787l-6.504-3.25v-9.073l6.504-3.251z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">120+ Live Classes &amp; Recordings</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32" data-name="Layer 1" id="Layer_1" stroke="#0634A1" stroke-width="0.16"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><path d="M18,6V7H17a1,1,0,0,1-1-1V4h1V6Z"></path><path d="M17,6V7h1a1,1,0,0,0,1-1V4H18V6Z"></path><path d="M18,2V1H17a1,1,0,0,0-1,1V3h1V2Z"></path><path d="M17,2V1h1a1,1,0,0,1,1,1V4H18V2Z"></path><rect height="1" transform="translate(27 53) rotate(180)" width="19" x="4" y="26"></rect><rect height="1" transform="translate(32 59) rotate(180)" width="18" x="7" y="29"></rect><rect height="1" transform="translate(42 -13) rotate(90)" width="21" x="17" y="14"></rect><rect height="1" transform="translate(22.5 7.5) rotate(90)" width="22" x="-3.5" y="14.5"></rect><path d="M28,25H27v2a2,2,0,0,1-2,2h0v1h0a3,3,0,0,0,3-3Z"></path><path d="M22,26h1v1a2,2,0,0,0,2,2h0v1h0a3,3,0,0,1-3-3Z"></path><path d="M4,26H5v1a2,2,0,0,0,2,2H8v1H7a3,3,0,0,1-3-3Z"></path><rect height="1" width="17" x="9" y="2"></rect><path d="M25,2V3h1a1,1,0,0,1,1,1V5h1V4a2,2,0,0,0-2-2Z"></path><path d="M10,2V3H9A1,1,0,0,0,8,4V5H7V4A2,2,0,0,1,9,2Z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text"> 24*7 Live Doubt Support</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Capa_1" viewBox="0 0 442 442" xml:space="preserve"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <path d="M179.046,93.365h84.845c2.761,0,5-2.239,5-5s-2.239-5-5-5h-84.845c-2.761,0-5,2.239-5,5S176.285,93.365,179.046,93.365z"></path> <path d="M122.977,120.046H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,120.046,122.977,120.046z "></path> <path d="M122.977,146.728H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,146.728,122.977,146.728z "></path> <path d="M122.977,173.409H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,173.409,122.977,173.409z "></path> <path d="M122.977,200.091H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,200.091,122.977,200.091z "></path> <path d="M122.977,226.772H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,226.772,122.977,226.772z "></path> <path d="M122.977,253.454H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,253.454,122.977,253.454z "></path> <path d="M122.977,280.135H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,280.135,122.977,280.135z "></path> <path d="M122.977,306.816H319.96c2.761,0,5-2.239,5-5s-2.239-5-5-5H122.977c-2.761,0-5,2.239-5,5S120.215,306.816,122.977,306.816z "></path> <path d="M232.008,323.498H122.977c-2.761,0-5,2.239-5,5s2.239,5,5,5h109.031c2.761,0,5-2.239,5-5S234.769,323.498,232.008,323.498z "></path> <path d="M385.536,68.464l-67-67C317.598,0.527,316.326,0,315,0H60c-2.761,0-5,2.239-5,5v432c0,2.761,2.239,5,5,5h322 c2.761,0,5-2.239,5-5V72C387,70.674,386.473,69.402,385.536,68.464z M320,17.071L369.929,67H320V17.071z M65,432V10h245v62 c0,2.761,2.239,5,5,5h62v355H65z"></path> <path d="M329.39,357.142c-0.717-1.979-2.596-3.298-4.702-3.298s-3.985,1.319-4.702,3.298l-15.366,42.453 c-0.939,2.597,0.403,5.463,3,6.403c0.562,0.203,1.136,0.3,1.701,0.3c2.046,0,3.966-1.265,4.702-3.3l4.001-11.055h13.326 l4.001,11.055c0.94,2.596,3.805,3.938,6.403,3c2.597-0.94,3.939-3.807,3-6.403L329.39,357.142z M321.645,381.943l3.043-8.409 l3.044,8.409H321.645z"></path> <path d="M342.466,304.771l-83.996,83.996c-1.953,1.953-1.953,5.119,0,7.071c0.977,0.976,2.256,1.464,3.536,1.464 s2.559-0.488,3.536-1.464l83.996-83.996c1.953-1.953,1.953-5.119,0-7.071C347.584,302.819,344.419,302.819,342.466,304.771z"></path> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">400+ DSA Practice Questions</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 24 24"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><path d="M20,6.52797748 L20,19.5 C20,20.8807119 18.8807119,22 17.5,22 L6.5,22 C5.11928813,22 4,20.8807119 4,19.5 L4,4.5 C4,3.11928813 5.11928813,2 6.5,2 L15.4720225,2 C15.6047688,1.99158053 15.7429463,2.03583949 15.8535534,2.14644661 L19.8535534,6.14644661 C19.9641605,6.25705373 20.0084195,6.39523125 20,6.52797748 Z M15,3 L6.5,3 C5.67157288,3 5,3.67157288 5,4.5 L5,19.5 C5,20.3284271 5.67157288,21 6.5,21 L17.5,21 C18.3284271,21 19,20.3284271 19,19.5 L19,7 L15.5,7 C15.2238576,7 15,6.77614237 15,6.5 L15,3 Z M16,3.70710678 L16,6 L18.2928932,6 L16,3.70710678 Z M12,16.2928932 L14.1464466,14.1464466 C14.3417088,13.9511845 14.6582912,13.9511845 14.8535534,14.1464466 C15.0488155,14.3417088 15.0488155,14.6582912 14.8535534,14.8535534 L11.9198269,17.7872799 C11.8307203,17.9246987 11.6759769,18.0156098 11.5,18.0156098 C11.3240231,18.0156098 11.1692797,17.9246987 11.0801731,17.7872799 L8.14644661,14.8535534 C7.95118446,14.6582912 7.95118446,14.3417088 8.14644661,14.1464466 C8.34170876,13.9511845 8.65829124,13.9511845 8.85355339,14.1464466 L11,16.2928932 L11,9.5 C11,9.22385763 11.2238576,9 11.5,9 C11.7761424,9 12,9.22385763 12,9.5 L12,16.2928932 L12,16.2928932 Z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">Comprehensive Notes </span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Capa_1" viewBox="0 0 394.497 394.497" xml:space="preserve"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <path d="M181.239,84.373c-30.412,30.413-30.412,79.896,0,110.309c15.206,15.206,35.18,22.809,55.154,22.809 s39.948-7.603,55.154-22.809c30.412-30.413,30.412-79.896,0-110.309C261.136,53.961,211.651,53.961,181.239,84.373z M295,174.026 v-68.998C307.48,126.239,307.48,152.817,295,174.026z M285,91.994v95.067c-0.177,0.181-0.343,0.37-0.522,0.55 c-26.514,26.512-69.652,26.514-96.168,0c-3.953-3.953-7.302-8.281-10.076-12.862H184c2.762,0,5-2.239,5-5s-2.238-5-5-5h-10.747 c-3.926-9.869-5.447-20.475-4.576-30.92H208c2.762,0,5-2.239,5-5s-2.238-5-5-5h-37.742c2.653-11.26,8.213-21.961,16.66-30.92H251 c2.762,0,5-2.239,5-5s-2.238-5-5-5h-52.269c11.361-7.562,24.51-11.349,37.662-11.349c17.413,0,34.827,6.628,48.084,19.885 C284.657,91.624,284.823,91.813,285,91.994z"></path> <path d="M389.225,266.902l-72.44-72.44c11.022-16.057,16.958-35.038,16.958-54.935c0-26.002-10.127-50.449-28.514-68.835 c-7.583-7.583-16.125-13.624-25.229-18.177V7.749c0-2.761-2.238-5-5-5H55.69c-1.326,0-2.598,0.527-3.535,1.464l-50.69,50.68 C0.527,55.831,0,57.103,0,58.429v328.32c0,2.761,2.238,5,5,5h270c2.762,0,5-2.239,5-5V226.54c3.882-1.941,7.658-4.157,11.303-6.649 l72.467,72.467c3.509,3.509,8.117,5.264,12.728,5.264c4.608,0,9.219-1.755,12.728-5.264c3.4-3.399,5.272-7.92,5.272-12.728 C394.497,274.822,392.625,270.302,389.225,266.902z M323.742,139.527c0,23.332-9.086,45.267-25.584,61.764 c-34.059,34.058-89.471,34.057-123.529,0c-16.498-16.498-25.584-38.433-25.584-61.764s9.086-45.267,25.584-61.764 c17.029-17.028,39.396-25.542,61.765-25.542s44.735,8.514,61.765,25.542C314.656,94.261,323.742,116.196,323.742,139.527z M50.69,19.817v33.611H17.073L50.69,19.817z M270,381.749H10V63.429h45.69c2.762,0,5-2.239,5-5v-45.68H270v35.448 c-34.511-12.638-74.79-5.156-102.441,22.496c-6.161,6.161-11.389,13.005-15.625,20.357h-46.932c-2.762,0-5,2.239-5,5s2.238,5,5,5 h41.922c-2.822,6.557-4.91,13.424-6.224,20.5H48.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h90.871c-0.213,2.64-0.326,5.301-0.326,7.979 c0,4.222,0.271,8.401,0.797,12.521H93c-2.762,0-5,2.239-5,5s2.238,5,5,5h48.656c1.676,7.109,4.145,13.978,7.364,20.5H48.5 c-2.762,0-5,2.239-5,5s2.238,5,5,5h106.222c3.678,5.64,7.964,10.941,12.836,15.814c1.642,1.642,3.343,3.186,5.07,4.686H155.5 c-2.762,0-5,2.239-5,5s2.238,5,5,5h30.89c15.335,9.179,32.667,13.781,50.004,13.781c11.394,0,22.781-2.006,33.606-5.971V381.749z M305.229,208.363c1.899-1.899,3.705-3.866,5.426-5.89l51.275,51.275l-11.314,11.314l-51.295-51.295 C301.341,212.053,303.322,210.269,305.229,208.363z M382.154,285.287c-3.119,3.119-8.195,3.119-11.314,0l-13.154-13.154 L369,260.819l13.154,13.154c1.511,1.511,2.343,3.52,2.343,5.657S383.665,283.776,382.154,285.287z"></path> <path d="M48.5,101.049h40.001c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,101.049,48.5,101.049z"></path> <path d="M48.5,162.049h27.501c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,162.049,48.5,162.049z"></path> <path d="M48.5,223.049h92.301c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,223.049,48.5,223.049z"></path> <path d="M231.5,243.549H86.501c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,243.549,231.5,243.549z"></path> <path d="M48.5,253.549h22.001c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,253.549,48.5,253.549z"></path> <path d="M231.5,304.549h-94.499c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,304.549,231.5,304.549z"></path> <path d="M48.5,314.549h72.801c2.762,0,5-2.239,5-5s-2.238-5-5-5H48.5c-2.762,0-5,2.239-5,5S45.738,314.549,48.5,314.549z"></path> <path d="M231.5,335.049H178c-2.762,0-5,2.239-5,5s2.238,5,5,5h53.5c2.762,0,5-2.239,5-5S234.262,335.049,231.5,335.049z"></path> <path d="M163.101,335.049h-89.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h89.5c2.762,0,5-2.239,5-5S165.862,335.049,163.101,335.049z"></path> <path d="M58.501,335.049H48.5c-2.762,0-5,2.239-5,5s2.238,5,5,5h10.001c2.762,0,5-2.239,5-5S61.263,335.049,58.501,335.049z"></path> <path d="M231.5,274.049h-30.499c-2.762,0-5,2.239-5,5s2.238,5,5,5H231.5c2.762,0,5-2.239,5-5S234.262,274.049,231.5,274.049z"></path> <path d="M48.5,284.049h135c2.762,0,5-2.239,5-5s-2.238-5-5-5h-135c-2.762,0-5,2.239-5,5S45.738,284.049,48.5,284.049z"></path> <path d="M251,123.829h-17.5c-2.762,0-5,2.239-5,5s2.238,5,5,5H251c2.762,0,5-2.239,5-5S253.762,123.829,251,123.829z"></path> <path d="M251,164.749h-46c-2.762,0-5,2.239-5,5s2.238,5,5,5h46c2.762,0,5-2.239,5-5S253.762,164.749,251,164.749z"></path> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">HackerRank Tests &amp; Quizzes</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 32 32"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><title>screen-users</title><path d="M9.74 21c-0.001-1.721-1.396-3.115-3.116-3.115s-3.116 1.395-3.116 3.116 1.395 3.116 3.116 3.116v0c1.721-0.002 3.115-1.397 3.116-3.117v-0zM5.008 21c0.001-0.892 0.724-1.615 1.616-1.615s1.616 0.724 1.616 1.616-0.724 1.616-1.616 1.616c0 0 0 0-0 0v0c-0.893-0.001-1.616-0.724-1.616-1.617v-0zM19.117 21c-0-1.721-1.396-3.116-3.117-3.116s-3.117 1.395-3.117 3.117c0 1.721 1.395 3.116 3.116 3.117h0c1.721-0.002 3.115-1.396 3.117-3.117v-0zM14.384 21c0-0.893 0.724-1.616 1.617-1.616s1.617 0.724 1.617 1.617-0.724 1.617-1.617 1.617c-0 0-0 0-0.001 0h0c-0.893-0.001-1.616-0.724-1.616-1.617v-0zM28.492 21c-0.001-1.721-1.396-3.115-3.116-3.115s-3.116 1.395-3.116 3.116 1.395 3.116 3.116 3.116c0 0 0.001 0 0.001 0h-0c1.72-0.003 3.113-1.397 3.115-3.117v-0zM23.76 21c0.001-0.892 0.724-1.615 1.616-1.615s1.616 0.724 1.616 1.616c0 0.892-0.723 1.616-1.615 1.616h-0c-0.893-0-1.617-0.724-1.617-1.617v-0zM25.377 25.531c-1.979 0.011-3.71 1.061-4.675 2.633l-0.014 0.024c-0.972-1.603-2.707-2.657-4.688-2.657s-3.717 1.055-4.675 2.633l-0.014 0.024c-0.974-1.603-2.711-2.657-4.695-2.657-2.611 0-4.794 1.827-5.343 4.272l-0.007 0.037c-0.011 0.048-0.017 0.103-0.017 0.16 0 0.414 0.336 0.75 0.75 0.75 0.357 0 0.656-0.25 0.731-0.585l0.001-0.005c0.406-1.803 1.994-3.129 3.891-3.129s3.485 1.326 3.886 3.102l0.005 0.027c0.076 0.339 0.375 0.589 0.731 0.59h0c0.021 0 0.044-0.005 0.065-0.007 0.022 0.002 0.044 0.007 0.065 0.007 0 0 0 0 0 0 0.357 0 0.656-0.25 0.73-0.585l0.001-0.005c0.406-1.803 1.994-3.129 3.891-3.129s3.485 1.326 3.886 3.102l0.005 0.027c0.115 0.337 0.428 0.574 0.797 0.574s0.682-0.238 0.795-0.568l0.002-0.006c0.407-1.803 1.994-3.129 3.892-3.129s3.485 1.326 3.887 3.102l0.005 0.027c0.076 0.34 0.374 0.59 0.732 0.59 0 0 0.001 0 0.001 0h-0c0.057-0 0.112-0.007 0.165-0.019l-0.005 0.001c0.34-0.076 0.59-0.375 0.59-0.733 0-0.057-0.006-0.112-0.018-0.165l0.001 0.005c-0.568-2.476-2.747-4.297-5.354-4.309h-0.001zM30 1.25h-28c-0.414 0-0.75 0.336-0.75 0.75v0 14c0 0.414 0.336 0.75 0.75 0.75s0.75-0.336 0.75-0.75v0-13.25h26.5v13.25c0 0.414 0.336 0.75 0.75 0.75s0.75-0.336 0.75-0.75v0-14c-0-0.414-0.336-0.75-0.75-0.75v0z"></path></g></svg>						</span>
										<span class="elementor-icon-list-text">12+ live Projects &amp; Deployments</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" fill="#0634A1" height="800px" width="800px" id="Layer_1" viewBox="0 0 512.001 512.001" xml:space="preserve" stroke="#0634A1" stroke-width="7.168014000000001"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"> <g> <g> <path d="M478.329,183.82H300.803c-7.9-27.511-23.412-52.593-45.133-72.042c-32.922-29.481-75.446-43.016-119.749-38.119 C64.871,81.518,8.048,138.871,0.809,210.032c-3.953,38.846,6.67,77.251,29.909,108.14c22.271,29.6,54.229,50.063,90.203,57.816 l37.845,37.844c3.177,3.178,7.395,4.861,11.698,4.86c2.138,0,4.296-0.416,6.358-1.27c6.214-2.574,10.227-8.582,10.227-15.307 V375.62c6.223-1.391,12.285-3.155,18.172-5.257v1.05c0,18.566,15.105,33.671,33.671,33.671h56.539l30.119,30.119 c2.694,2.694,6.269,4.121,9.916,4.121c1.812,0,3.641-0.353,5.389-1.076c5.267-2.182,8.67-7.275,8.67-12.976v-20.188H478.33 c18.566,0,33.671-15.105,33.671-33.671V217.489C512,198.925,496.895,183.82,478.329,183.82z M177.625,361.164 c-3.825,0.682-6.609,4.007-6.609,7.892v33.06c0,0.191,0,0.357-0.33,0.494c-0.33,0.135-0.446,0.019-0.583-0.115l-39.539-39.539 c-1.121-1.121-2.55-1.886-4.106-2.194c-33.084-6.575-62.535-25.124-82.928-52.229c-20.805-27.654-30.313-62.059-26.771-96.878 c3.121-30.685,17.014-59.873,39.119-82.19c22.109-22.32,51.16-36.479,81.805-39.868c5.332-0.59,10.628-0.882,15.885-0.882 c33.893,0,65.884,12.154,91.405,35.007c29.082,26.042,45.761,63.35,45.761,102.359 C290.735,292.663,243.166,349.473,177.625,361.164z M495.966,371.414c0,9.725-7.912,17.637-17.637,17.637H341.508 c-4.427,0-8.017,3.589-8.017,8.017v23.403l-29.071-29.071c-1.503-1.504-3.542-2.348-5.668-2.348h-59.859 c-9.725,0-17.637-7.912-17.637-17.637v-7.818c51.32-25.224,85.513-77.856,85.513-137.515c0-8.852-0.781-17.622-2.28-26.228 h173.841c9.725,0,17.637,7.912,17.637,17.637V371.414z"></path> </g> </g> <g> <g> <path d="M449.792,246.027c-3.13-3.131-8.206-3.131-11.337,0l-79.845,79.845l-37.069-37.069c-3.131-3.131-8.207-3.131-11.337,0 c-3.131,3.131-3.131,8.207,0,11.337l42.737,42.737c1.565,1.565,3.617,2.348,5.668,2.348c2.051,0,4.104-0.782,5.669-2.348 l85.513-85.513C452.923,254.233,452.923,249.157,449.792,246.027z"></path> </g> </g> <g> <g> <path d="M153.385,286.464c-0.003,0-0.007,0-0.011,0c-4.427,0-8.022,3.595-8.022,8.022c0,0.001,0,0.003,0,0.005 c0,0.002,0,0.003,0,0.005c0,4.427,3.595,8.022,8.022,8.022c0.003,0,0.008,0,0.011,0c4.427,0,8.022-3.595,8.022-8.022 c0-0.001,0-0.003,0-0.005c0-0.002,0-0.003,0-0.005C161.407,290.059,157.812,286.464,153.385,286.464z"></path> </g> </g> <g> <g> <path d="M189.094,164.713c-9.712-9.712-22.397-15.06-35.719-15.059c-27.994,0.002-50.769,22.78-50.769,50.773 c0,4.427,3.589,8.017,8.017,8.017c4.427,0,8.017-3.589,8.017-8.017c0-19.154,15.583-34.739,34.737-34.74 c9.039,0,17.697,3.679,24.38,10.362c6.683,6.683,10.363,15.342,10.363,24.381c-0.001,15.227-10.176,28.911-24.742,33.279 c-10.776,3.231-18.014,12.886-18.014,24.024v2.554c0,4.427,3.589,8.017,8.017,8.017c4.427,0,8.017-3.589,8.017-8.017v-2.554 c0-4.002,2.647-7.485,6.587-8.666c21.295-6.386,36.169-26.385,36.17-48.636C204.154,187.11,198.806,174.424,189.094,164.713z"></path> </g> </g> </g></svg>						</span>
										<span class="elementor-icon-list-text">Case Studies</span>
									</li>
								<li class="elementor-icon-list-item">
											<span class="elementor-icon-list-icon">
							<svg xmlns="http://www.w3.org/2000/svg" fill="#0634A1" width="800px" height="800px" viewBox="0 0 24 24"><g id="SVGRepo_bgCarrier" stroke-width="0"></g><g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g><g id="SVGRepo_iconCarrier"><g id="Repeat"><path d="M2.078,17.562c-0.01,-0.039 -0.016,-0.08 -0.016,-0.123c0,-0.138 0.056,-0.263 0.147,-0.353c0.008,-0.009 1.416,-1.417 2,-2c0.198,-0.198 0.507,-0.183 0.707,-0c0.199,0.183 0.185,0.522 -0,0.707l-1.147,1.146l15.669,0c0.828,0 1.5,-0.671 1.5,-1.5l0,-3.439c0,-0.276 0.224,-0.5 0.5,-0.5c0.276,0 0.5,0.224 0.5,0.5l0,3.439c0,1.381 -1.12,2.5 -2.5,2.5l-15.669,0l1.147,1.147c0.198,0.198 0.183,0.507 -0,0.707c-0.183,0.199 -0.522,0.185 -0.707,-0l-2,-2c-0.066,-0.063 -0.11,-0.143 -0.131,-0.231Zm19.845,-11.105c0.01,0.039 0.015,0.08 0.015,0.122c0,0.138 -0.056,0.263 -0.147,0.354c-0.008,0.008 -1.416,1.417 -2,2c-0.197,0.198 -0.507,0.183 -0.707,-0c-0.199,-0.183 -0.185,-0.522 0,-0.707l1.147,-1.147l-15.669,0c-0.828,0 -1.5,0.672 -1.5,1.5l0,3.439c-0,0.276 -0.224,0.5 -0.5,0.5c-0.276,0 -0.5,-0.224 -0.5,-0.5l0,-3.439c0,-1.381 1.12,-2.5 2.5,-2.5l15.669,0l-1.146,-1.146c-0.198,-0.198 -0.183,-0.507 -0,-0.707c0.183,-0.199 0.522,-0.185 0.707,-0l2,2c0.065,0.063 0.11,0.143 0.131,0.231Z"></path></g></g></svg>						</span>
										<span class="elementor-icon-list-text">Access to Global Peer Community</span>
									</li>
						</ul>
						</div>
				</div>
		<div class="elementor-element elementor-element-a3a97ee e-con-full e-flex e-con e-child" data-id="a3a97ee" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-e6398d7 elementor-widget__width-initial elementor-widget elementor-widget-heading" data-id="e6398d7" data-element_type="widget" data-e-type="widget" data-widget_type="heading.default">
				<div class="elementor-widget-container">
					<h2 class="elementor-heading-title elementor-size-default"><p><span style="font-size: 13px;color: black">Buy for </span><span style="font-size: 16px;color: #63b7fd;font-weight: bold">51% OFF</span><br />
<span style="font-size: 13px;color: gray;text-decoration: line-through">₹35,000.00</span><span style="font-size: 17px;color: black;font-weight: bold"> ₹16,999.00</span></p>
</h2>				</div>
				</div>
				<div class="elementor-element elementor-element-856e4c2 elementor-mobile-align-right elementor-widget-mobile__width-initial elementor-widget elementor-widget-button" data-id="856e4c2" data-element_type="widget" data-e-type="widget" data-widget_type="button.default">
				<div class="elementor-widget-container">
									<div class="elementor-button-wrapper">
					<a class="elementor-button elementor-button-link elementor-size-sm" href="https://getsdeready.com/courses/master-dsa-web-dev-system-design/">
						<span class="elementor-button-content-wrapper">
									<span class="elementor-button-text">Learn More</span>
					</span>
					</a>
				</div>
								</div>
				</div>
				</div>
					</div>
				</div>
				</div>
				</div>
		</div>
					<div class="swiper-pagination"></div>
						</div>
				</div>
				<div class="elementor-element elementor-element-13d664c0 elementor-align-left elementor-tablet-align-left elementor-mobile-align-left elementor-widget elementor-widget-button" data-id="13d664c0" data-element_type="widget" data-e-type="widget" data-widget_type="button.default">
				<div class="elementor-widget-container">
									<div class="elementor-button-wrapper">
					<a class="elementor-button elementor-button-link elementor-size-sm" href="https://getsdeready.com/our-courses/">
						<span class="elementor-button-content-wrapper">
									<span class="elementor-button-text">Explore our flagship courses</span>
					</span>
					</a>
				</div>
								</div>
				</div>
					</div>
				</div>
		<div class="elementor-element elementor-element-580c20a4 e-flex e-con-boxed e-con e-parent" data-id="580c20a4" data-element_type="container" data-e-type="container" data-settings="{&quot;background_background&quot;:&quot;classic&quot;}">
					<div class="e-con-inner">
				<div class="elementor-element elementor-element-1c6c9ce5 elementor-widget elementor-widget-heading" data-id="1c6c9ce5" data-element_type="widget" data-e-type="widget" data-widget_type="heading.default">
				<div class="elementor-widget-container">
					<h2 class="elementor-heading-title elementor-size-default">Reach Out Now</h2>				</div>
				</div>
				<div class="elementor-element elementor-element-23e7351f elementor-widget elementor-widget-text-editor" data-id="23e7351f" data-element_type="widget" data-e-type="widget" data-widget_type="text-editor.default">
				<div class="elementor-widget-container">
									<p>If you have any queries, please fill out this form. We will surely reach out to you.</p>								</div>
				</div>
		<div class="elementor-element elementor-element-23842cd3 e-flex e-con-boxed e-con e-child" data-id="23842cd3" data-element_type="container" data-e-type="container">
					<div class="e-con-inner">
		<div class="elementor-element elementor-element-436602ce e-con-full e-flex e-con e-child" data-id="436602ce" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-306a3cb9 elementor-button-align-start elementor-widget elementor-widget-form" data-id="306a3cb9" data-element_type="widget" data-e-type="widget" data-settings="{&quot;button_width&quot;:&quot;66&quot;,&quot;step_next_label&quot;:&quot;Next&quot;,&quot;step_previous_label&quot;:&quot;Previous&quot;,&quot;step_type&quot;:&quot;number_text&quot;,&quot;step_icon_shape&quot;:&quot;circle&quot;}" data-widget_type="form.default">
				<div class="elementor-widget-container">
							<form class="elementor-form" method="post" name="Request callback form at the front" aria-label="Request callback form at the front">
			<input type="hidden" name="post_id" value="45941"/>
			<input type="hidden" name="form_id" value="306a3cb9"/>
			<input type="hidden" name="referer_title" value="Caching Strategies: Interview Guide" />

							<input type="hidden" name="queried_id" value="45941"/>
			
			<div class="elementor-form-fields-wrapper elementor-labels-above">
								<div class="elementor-field-type-text elementor-field-group elementor-column elementor-field-group-name elementor-col-100 elementor-field-required elementor-mark-required">
												<label for="form-field-name" class="elementor-field-label">
								Name							</label>
														<input size="1" type="text" name="form_fields[name]" id="form-field-name" class="elementor-field elementor-size-sm  elementor-field-textual" placeholder="Your Full Name" required="required">
											</div>
								<div class="elementor-field-type-email elementor-field-group elementor-column elementor-field-group-email elementor-col-100 elementor-field-required elementor-mark-required">
												<label for="form-field-email" class="elementor-field-label">
								Email							</label>
														<input size="1" type="email" name="form_fields[email]" id="form-field-email" class="elementor-field elementor-size-sm  elementor-field-textual" placeholder="Your email address" required="required">
											</div>
								<div class="elementor-field-type-tel elementor-field-group elementor-column elementor-field-group-phone elementor-col-100 elementor-field-required elementor-mark-required">
												<label for="form-field-phone" class="elementor-field-label">
								Phone Number							</label>
								<input size="1" type="tel" name="form_fields[phone]" id="form-field-phone" class="elementor-field elementor-size-sm  elementor-field-textual" placeholder="Please provide your mobile number" required="required" pattern="[0-9()#&amp;+*-=.]+" title="Only numbers and phone characters (#, -, *, etc) are accepted.">

						</div>
								<div class="elementor-field-type-select elementor-field-group elementor-column elementor-field-group-experience elementor-col-100 elementor-field-required elementor-mark-required">
												<label for="form-field-experience" class="elementor-field-label">
								Experience							</label>
								<div class="elementor-field elementor-select-wrapper remove-before ">
			<div class="select-caret-down-wrapper">
				<svg aria-hidden="true" class="e-font-icon-svg e-eicon-caret-down" viewBox="0 0 571.4 571.4" xmlns="http://www.w3.org/2000/svg"><path d="M571 393Q571 407 561 418L311 668Q300 679 286 679T261 668L11 418Q0 407 0 393T11 368 36 357H536Q550 357 561 368T571 393Z"></path></svg>			</div>
			<select name="form_fields[experience]" id="form-field-experience" class="elementor-field-textual elementor-size-sm" required="required">
									<option value="Working Professionals - Technical Roles">Working Professionals - Technical Roles</option>
									<option value="Working Professionals - Non Technical Roles">Working Professionals - Non Technical Roles</option>
									<option value="College Students - Final Year">College Students - Final Year</option>
									<option value="College Students - 1st Year to Pre Final Year">College Students - 1st Year to Pre Final Year</option>
									<option value="Others">Others</option>
							</select>
		</div>
						</div>
								<div class="elementor-field-group elementor-column elementor-field-type-submit elementor-col-66 e-form__buttons">
					<button class="elementor-button elementor-size-sm" type="submit">
						<span class="elementor-button-content-wrapper">
															<span class="elementor-button-icon">
									<svg aria-hidden="true" class="e-font-icon-svg e-fas-phone-alt" viewBox="0 0 512 512" xmlns="http://www.w3.org/2000/svg"><path d="M497.39 361.8l-112-48a24 24 0 0 0-28 6.9l-49.6 60.6A370.66 370.66 0 0 1 130.6 204.11l60.6-49.6a23.94 23.94 0 0 0 6.9-28l-48-112A24.16 24.16 0 0 0 122.6.61l-104 24A24 24 0 0 0 0 48c0 256.5 207.9 464 464 464a24 24 0 0 0 23.4-18.6l24-104a24.29 24.29 0 0 0-14.01-27.6z"></path></svg>																	</span>
																						<span class="elementor-button-text">Request Callback</span>
													</span>
					</button>
				</div>
			</div>
		</form>
						</div>
				</div>
				</div>
		<div class="elementor-element elementor-element-56c8986f e-con-full e-grid e-con e-child" data-id="56c8986f" data-element_type="container" data-e-type="container">
		<div class="elementor-element elementor-element-31a0fcf e-con-full e-flex e-con e-child" data-id="31a0fcf" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-1f03dcc9 elementor-view-default elementor-position-block-start elementor-mobile-position-block-start elementor-widget elementor-widget-icon-box" data-id="1f03dcc9" data-element_type="widget" data-e-type="widget" data-widget_type="icon-box.default">
				<div class="elementor-widget-container">
							<div class="elementor-icon-box-wrapper">

						<div class="elementor-icon-box-icon">
				<span  class="elementor-icon">
				<svg aria-hidden="true" class="e-font-icon-svg e-fas-mail-bulk" viewBox="0 0 576 512" xmlns="http://www.w3.org/2000/svg"><path d="M160 448c-25.6 0-51.2-22.4-64-32-64-44.8-83.2-60.8-96-70.4V480c0 17.67 14.33 32 32 32h256c17.67 0 32-14.33 32-32V345.6c-12.8 9.6-32 25.6-96 70.4-12.8 9.6-38.4 32-64 32zm128-192H32c-17.67 0-32 14.33-32 32v16c25.6 19.2 22.4 19.2 115.2 86.4 9.6 6.4 28.8 25.6 44.8 25.6s35.2-19.2 44.8-22.4c92.8-67.2 89.6-67.2 115.2-86.4V288c0-17.67-14.33-32-32-32zm256-96H224c-17.67 0-32 14.33-32 32v32h96c33.21 0 60.59 25.42 63.71 57.82l.29-.22V416h192c17.67 0 32-14.33 32-32V192c0-17.67-14.33-32-32-32zm-32 128h-64v-64h64v64zm-352-96c0-35.29 28.71-64 64-64h224V32c0-17.67-14.33-32-32-32H96C78.33 0 64 14.33 64 32v192h96v-32z"></path></svg>				</span>
			</div>
			
						<div class="elementor-icon-box-content">

									<h3 class="elementor-icon-box-title">
						<span  >
							Contact Email						</span>
					</h3>
				
									<p class="elementor-icon-box-description">
						Reach us at the following email address.					</p>
				
			</div>
			
		</div>
						</div>
				</div>
				<div class="elementor-element elementor-element-a390b21 elementor-widget elementor-widget-text-editor" data-id="a390b21" data-element_type="widget" data-e-type="widget" data-widget_type="text-editor.default">
				<div class="elementor-widget-container">
									<p><span style="text-decoration: underline;"><a href="/cdn-cgi/l/email-protection" class="__cf_email__" data-cfemail="c9a8bbbca789aeacbdbaadacbbaca8adb0e7aaa6a4">[email&#160;protected]</a></span></p>								</div>
				</div>
				</div>
		<div class="elementor-element elementor-element-6874aa3f e-con-full e-flex e-con e-child" data-id="6874aa3f" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-d966629 elementor-view-default elementor-position-block-start elementor-mobile-position-block-start elementor-widget elementor-widget-icon-box" data-id="d966629" data-element_type="widget" data-e-type="widget" data-widget_type="icon-box.default">
				<div class="elementor-widget-container">
							<div class="elementor-icon-box-wrapper">

						<div class="elementor-icon-box-icon">
				<span  class="elementor-icon">
				<svg aria-hidden="true" class="e-font-icon-svg e-fas-phone-alt" viewBox="0 0 512 512" xmlns="http://www.w3.org/2000/svg"><path d="M497.39 361.8l-112-48a24 24 0 0 0-28 6.9l-49.6 60.6A370.66 370.66 0 0 1 130.6 204.11l60.6-49.6a23.94 23.94 0 0 0 6.9-28l-48-112A24.16 24.16 0 0 0 122.6.61l-104 24A24 24 0 0 0 0 48c0 256.5 207.9 464 464 464a24 24 0 0 0 23.4-18.6l24-104a24.29 24.29 0 0 0-14.01-27.6z"></path></svg>				</span>
			</div>
			
						<div class="elementor-icon-box-content">

									<h3 class="elementor-icon-box-title">
						<span  >
							Phone Number						</span>
					</h3>
				
									<p class="elementor-icon-box-description">
						You can reach us by phone as well.					</p>
				
			</div>
			
		</div>
						</div>
				</div>
				<div class="elementor-element elementor-element-52d7c9a4 elementor-widget elementor-widget-text-editor" data-id="52d7c9a4" data-element_type="widget" data-e-type="widget" data-widget_type="text-editor.default">
				<div class="elementor-widget-container">
									<p><span style="text-decoration: underline;">+91-97737 28034</span></p>								</div>
				</div>
				</div>
		<div class="elementor-element elementor-element-1378307e e-con-full e-flex e-con e-child" data-id="1378307e" data-element_type="container" data-e-type="container">
				<div class="elementor-element elementor-element-10afd2e6 elementor-view-default elementor-position-block-start elementor-mobile-position-block-start elementor-widget elementor-widget-icon-box" data-id="10afd2e6" data-element_type="widget" data-e-type="widget" data-widget_type="icon-box.default">
				<div class="elementor-widget-container">
							<div class="elementor-icon-box-wrapper">

						<div class="elementor-icon-box-icon">
				<span  class="elementor-icon">
				<svg aria-hidden="true" class="e-font-icon-svg e-fas-location-arrow" viewBox="0 0 512 512" xmlns="http://www.w3.org/2000/svg"><path d="M444.52 3.52L28.74 195.42c-47.97 22.39-31.98 92.75 19.19 92.75h175.91v175.91c0 51.17 70.36 67.17 92.75 19.19l191.9-415.78c15.99-38.39-25.59-79.97-63.97-63.97z"></path></svg>				</span>
			</div>
			
						<div class="elementor-icon-box-content">

									<h3 class="elementor-icon-box-title">
						<span  >
							Our Location						</span>
					</h3>
				
									<p class="elementor-icon-box-description">
						Rohini, Sector-3, Delhi-110085					</p>
				
			</div>
			
		</div>
						</div>
				</div>
				</div>
				</div>
					</div>
				</div>
					</div>
				</div>
				</div>
		
</div><!-- #content -->
