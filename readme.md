
# Stagecoach Hunter - A Dystopian Ride-Sharing App

**Stagecoach Hunter** is a **dystopian ride-sharing app** set in a world where all modern vehicles have disappeared, and **resources** are scarce. In a post-apocalyptic setting, users rely on **horse-drawn stagecoaches** for transportation and cargo delivery. The app is essential for people in the state of **Tumbleweed**, a Wild West-like region, and operates under a unique **barter-based economy**.

The app features different types of users, including privileged users, normal citizens, and mysterious **admins** who control the system. The app **never updates**, and no one knows who created it, making it even more mysterious and essential for survival.

## Features

### 1. **User Roles**
- **Good (Privileged Users)**
    - Receive special benefits like **priority rides**, **protection perks**, and **exclusive access**.
- **Bad (Drifters)**
    - Stagecoach drivers who **carry people and cargo** for a **barter or dollar**. They can **accept or reject requests** based on location and availability.
- **Ugly (Normal Citizens)**
    - Regular users who can **request rides or cargo transport** and **negotiate payment** using **food, goods, or money**.
- **Black Hats (Admins)**
    - The mysterious **admins** who control the system. They can **ban users**, **modify barter rates**, and **control ride requests**.

### 2. **Matching System**
- **Location-based Matching**
    - Users input their location using **x/y coordinates**. The system will match **Drifters** based on **proximity** and **availability**.
    - A **center of the city (0,0)** acts as the **origin**, and users' locations are calculated accordingly.

### 3. **Ride & Cargo Matching**
- **Ride Requests**
    - Citizens can request **rides** or **cargo transport** through the app.
    - **Drifters** can **accept** or **reject** the requests based on their **location** and **availability**.

### 4. **Barter Economy**
- Users can **pay with dollars** or **barter** (food, weapons, goods).
- **Drifters** have the freedom to set **barter prices** based on the **scarcity of resources**.

### 5. **Payment Types**
- **Dollar**
    - Traditional currency used when available.
- **Barter**
    - Users exchange items of value like **food, supplies, and ammunition**.

### 6. **City Center and World Setting**
- The app uses **Tumbleweed**, the city center located at **coordinates (0, 0)**, as a reference point.
- **Drifters** and **Users** can update their **location** to enable better matching and help manage requests efficiently.

### 7. **User Reputation & Risk**
- **Drifters** and **Users** have a **reputation system**. Higher reputation leads to **better opportunities** and **trust** from others.
- Reputation can be affected by **completed rides**, **successful barters**, or **betrayals** (for example, a Drifter refusing to complete a ride).

### 8. **App Updates & Mystery**
- The app **never updates**, and no one knows who created it. It has become a **critical tool for survival** in the wild world of Tumbleweed. The **Black Hats** control it, but their identities remain hidden.

---

## Technology Stack
- **Backend:** Java Spring Boot (REST API)
- **Database:** PostgreSQL (for user data, ride requests, barters)
- **Location Matching:** **Euclidean Distance** for proximity calculation
- **Frontend:** React Native (optional, low-power UI for mobile devices)
- **Barter System:** Custom logic for managing barter trades
- **Payment System:** Dollar and barter-based economy (custom)

## How to Run
1. Clone the repository.
2. Set up a PostgreSQL database.
3. Configure the `application.properties` with your database credentials.
4. Run the Spring Boot application (`mvn spring-boot:run`).
5. Open the app and start using the **Stagecoach Hunter** system!

---

## Future Features
- **AI-based Job Matching** - Suggest the **best Drifter** for a ride based on reputation, speed, and cargo needs.
- **Map and World Expansion** - Enable exploration of **Tumbleweed**'s surrounding areas.
- **Real-Time Chat** - Enable **direct communication** between users and Drifters.

