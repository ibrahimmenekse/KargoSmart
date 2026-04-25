---
name: Cargo Management System
colors:
  surface: '#f9f9f9'
  surface-dim: '#dadada'
  surface-bright: '#f9f9f9'
  surface-container-lowest: '#ffffff'
  surface-container-low: '#f3f3f3'
  surface-container: '#eeeeee'
  surface-container-high: '#e8e8e8'
  surface-container-highest: '#e2e2e2'
  on-surface: '#1a1c1c'
  on-surface-variant: '#454652'
  inverse-surface: '#2f3131'
  inverse-on-surface: '#f1f1f1'
  outline: '#767683'
  outline-variant: '#c6c5d4'
  surface-tint: '#4c56af'
  primary: '#000666'
  on-primary: '#ffffff'
  primary-container: '#1a237e'
  on-primary-container: '#8690ee'
  inverse-primary: '#bdc2ff'
  secondary: '#046b5e'
  on-secondary: '#ffffff'
  secondary-container: '#9defde'
  on-secondary-container: '#0f6f62'
  tertiary: '#380b00'
  on-tertiary: '#ffffff'
  tertiary-container: '#5c1800'
  on-tertiary-container: '#e17c5a'
  error: '#ba1a1a'
  on-error: '#ffffff'
  error-container: '#ffdad6'
  on-error-container: '#93000a'
  primary-fixed: '#e0e0ff'
  primary-fixed-dim: '#bdc2ff'
  on-primary-fixed: '#000767'
  on-primary-fixed-variant: '#343d96'
  secondary-fixed: '#a0f2e1'
  secondary-fixed-dim: '#84d5c5'
  on-secondary-fixed: '#00201b'
  on-secondary-fixed-variant: '#005046'
  tertiary-fixed: '#ffdbd0'
  tertiary-fixed-dim: '#ffb59d'
  on-tertiary-fixed: '#390c00'
  on-tertiary-fixed-variant: '#7b2e12'
  background: '#f9f9f9'
  on-background: '#1a1c1c'
  surface-variant: '#e2e2e2'
typography:
  h1:
    fontFamily: Inter
    fontSize: 32px
    fontWeight: '700'
    lineHeight: '1.2'
    letterSpacing: -0.02em
  h2:
    fontFamily: Inter
    fontSize: 24px
    fontWeight: '600'
    lineHeight: '1.3'
    letterSpacing: -0.01em
  h3:
    fontFamily: Inter
    fontSize: 20px
    fontWeight: '600'
    lineHeight: '1.4'
  body-lg:
    fontFamily: Inter
    fontSize: 16px
    fontWeight: '400'
    lineHeight: '1.5'
  body-md:
    fontFamily: Inter
    fontSize: 14px
    fontWeight: '400'
    lineHeight: '1.5'
  label-sm:
    fontFamily: Inter
    fontSize: 12px
    fontWeight: '600'
    lineHeight: '1'
    letterSpacing: 0.05em
  data-tabular:
    fontFamily: Inter
    fontSize: 14px
    fontWeight: '500'
    lineHeight: '1'
rounded:
  sm: 0.25rem
  DEFAULT: 0.5rem
  md: 0.75rem
  lg: 1rem
  xl: 1.5rem
  full: 9999px
spacing:
  sidebar-width: 280px
  container-padding: 2rem
  gutter: 1.5rem
  stack-sm: 0.5rem
  stack-md: 1rem
  stack-lg: 2rem
---

## Brand & Style
The design system is anchored in the **Corporate / Modern** aesthetic, prioritizing utility, reliability, and precision. Designed for logistics professionals who manage complex global supply chains, the visual language avoids unnecessary decoration in favor of clarity and high-speed information processing. 

The emotional response should be one of "command and control." By utilizing a structured grid and a rigorous information hierarchy, the design system transforms dense data into actionable insights. The style is defined by clean lines, ample negative space for legibility, and a professional color palette that signals institutional trust.

## Colors
The color strategy for this design system utilizes **Deep Blue (#1A237E)** as the primary anchor, representing authority and the global nature of cargo logistics. **Modern Teal (#00695C)** serves as a functional accent, used primarily for "success" states, active confirmations, and primary "Go" actions.

The background uses **Light Gray (#F5F5F5)** to reduce eye strain during long working sessions, creating a soft contrast against the pure white surface cards. High-contrast text (#1A1A1A) ensures accessibility standards are met for critical data points like shipment IDs and tracking numbers.

## Typography
This design system exclusively employs **Inter** for its exceptional legibility in data-heavy environments. The typeface is configured with specific attention to tabular figures (`tnum`) for shipment weights, costs, and timestamps, ensuring numbers align perfectly in tables.

Hierarchy is established through weight shifts rather than dramatic size changes. Headlines use a tighter letter-spacing for a modern, authoritative feel, while labels use uppercase styling with increased tracking to differentiate metadata from primary content.

## Layout & Spacing
The layout follows a **Fluid Grid** model with a persistent left-hand sidebar. The sidebar is fixed at 280px to provide immediate access to global modules (Dashboard, Fleet, Inventory, Analytics). 

The main content area utilizes a 12-column grid with a 24px (1.5rem) gutter. Spacing follows an 8pt linear scale to maintain mathematical harmony. Information-dense sections, such as manifest tables, may drop to a 4pt scale to maximize vertical real estate without sacrificing clarity.

## Elevation & Depth
This design system uses **Tonal Layering** combined with **Ambient Shadows** to create a structured hierarchy. The base background is the lowest level (Level 0). Cards and the sidebar sit on Level 1, utilizing a very subtle, diffused shadow: `0px 4px 12px rgba(0, 0, 0, 0.05)`.

Interactive elements, such as hovered cards or active dropdowns, lift to Level 2 with a slightly more pronounced shadow to indicate "pick-up." No heavy borders are used; instead, depth is communicated through these soft shadows and a 1px border (#E0E0E0) to define boundaries on the light gray background.

## Shapes
A **Rounded (0.5rem / 8px)** shape language is applied across the system to soften the "industrial" feel of cargo data and make the interface more approachable. 

Primary containers and dashboard cards use a radius of 12px (rounded-lg) to frame content effectively. Buttons and input fields use a consistent 8px radius. Small UI elements like status badges (tags) use a fully pill-shaped radius to distinguish them from interactive buttons.

## Components

### Buttons
- **Primary:** Deep Blue fill, white text. Bold, 8px corners.
- **Secondary:** Modern Teal outline or transparent background with teal text for "Positive" actions.
- **Ghost:** Minimal padding, used for utility functions within table rows.

### Cards
- White background, 12px corner radius, Level 1 shadow.
- Header sections within cards should have a subtle bottom border (#E0E0E0) to separate titles from content.

### Inputs & Selects
- 1px neutral border, turning Deep Blue on focus.
- Help text and error messages use 12px Inter, positioned precisely 4px below the field.

### Status Badges (Chips)
- Used for shipment status (e.g., "In Transit", "Delivered", "Delayed").
- Use low-saturation background tints of the status color with high-saturation text for readability.

### Data Tables
- The core of the design system. Rows should have a subtle hover state (#F9F9F9).
- Column headers are `label-sm` (uppercase, bold) for clear categorization.

### Persistent Sidebar
- Deep Blue background (#1A237E) or White with a right-hand border.
- Active states are indicated by a 4px teal vertical bar on the leading edge of the menu item.