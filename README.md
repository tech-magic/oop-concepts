
# The Essential Toolbox: OOP Concepts, Agile-Scrum, SOLID Principles, and Design Patterns

This guide explains the practical application of core OOP (Object Oriented Programming) concepts—abstraction, encapsulation, inheritance, and polymorphism—through real-world examples.
It covers how Agile-Scrum manages projects and how UML diagrams illustrate Object-Oriented Designs for both technical and non-technical stakeholders.
It also introduces the practical application of SOLID principles and key design patterns (creational, structural, and behavioral) for building flexible and maintainable software systems.

<p align="center">
  <img src="OOP_Overview.png" alt="Mastering OOP: A Visual Overview" width="650">
  <h3 align="center"><em>Mastering OOP: A Visual Overview</em></h3>
</p>

---

## Conceptual Mindmap

Here is a mind map illustrating the relationships between OOP Concepts, OO Design Principles, OO Patterns, and their practical application in real-world IT industry projects from a developer/architect's perspective:

```mermaid
mindmap
  root((IT Project))
    Business Scenario
        Requirement Analysis
            Functional Requirements
            Non-functional Requirements
            Constraints
        Identifying Domain Entities & Relationships
            OOP Concepts
                Abstraction
                    by Specialization
                    by Generalization
                    by Aggregation
                Encapsulation
                    Design by Contract
                Inheritance
                    Single
                    Multiple
                    Multi-level
                    Hierarchical
                    Hybrid
                Polymorphism
    Planning, Execution & Delivery
        Agile Manifesto
            Scrum Methodology
                Sprint
                    Sprint Item
                        SMART
                            S - Specific
                            M - Measurable
                            A - Achievable
                            R - Relevant
                            T - Time-bound
                        Definition of Done
                        Estimation
                            Story Points
                                Fibanocci Estimates
                Product Backlog
                    Product Backlog Item Types
                        Epic
                        User Story
                        Feature
                        Bug
                        Spike
                        Design Change
                        Requirement Analysis
                Minimum Viable Product
                Potentially Shippable Product Increment
            Agile Ceremonies
                Backlog Grooming
                Sprint Planning
                Daily Standup
                Sprint Retrospective
                Sprint Demo
    Documentation
        UML
            Use-case Diagram
                Entity
                  Use-case
                  Actor
                Relationship
                    Association
                    Actor Generalization
                    Extend
                    Include
                    Use-case Generalization
            Class Diagram
                Class
                    Attribute
                    Method
                    Stereotype
                        Entity
                        Boundary
                        Control
                        Interface
                Relationship
                    Dependency
                    Association
                    Aggregation
                    Composition
                    Generalization
                    Realization
    Design & Implementation
        Guidelines
            SOLID Principles
                S - Single Responsibility
                O - Open/Closed
                L - Liskov Substitution
                I - Interface Segregation
                D - Dependency Inversion
        Common Reusable Solutions
            OO Design Patterns
                Creational
                    Factory Method
                    Abstract Factory
                    Singleton
                    Builder
                    Prototype
                Structural
                    Adapter
                    Bridge
                    Composite
                    Decorator
                    Facade
                    Flyweight
                    Proxy
                Behavioral
                    Chain of Responsibility
                    Command
                    Interpreter
                    Iterator
                    Mediator
                    Memento
                    Observer
                    State
                    Strategy
                    Template Method
                    Visitor
```

---

## Part 1: Practical OOP

Explains practical application of OO Concepts (Abstraction, Encapsulation, Inheritance, and Polymorphism) with day-to-day concrete examples. 

### Key Concepts
- **Abstraction**: Hiding complex implementation details and showing only essential features.
  
- **Encapsulation**: Bundling the data and methods that operate on the data within a single unit (class).

- **Inheritance**: Mechanism where a new class inherits properties and behavior from an existing class.

- **Polymorphism**: Ability of different classes to respond to the same method call in different ways.

---

## Part 2: Object Oriented Design Principles

1. **Agile-Scrum Methodology**  
   Scrum is an agile process framework for managing complex product development.
   
2. **Requirement Analysis with UML Use Case Diagrams**  
   Visualize functional requirements and interactions between the system and users.

3. **OO Design with UML Class Diagrams**  
   Diagram that represents the structure of the system, showing classes, attributes, methods, and their relationships.

4. **Mapping UML Class Diagram Relationships into Java Implementation**  
   Mapping associations, compositions, and inheritance into Java code using appropriate keywords.

Please refer to the below article for more details: <br/>
https://medium.com/lexicon-digital/inside-the-object-oriented-toolbox-mapping-between-design-implementation-405f00e22bd

5. **SOLID Principles Explained with Concrete Examples**  
   The **SOLID** principles are a set of design principles that help software developers design more understandable, flexible, and maintainable code.  
   
   - **S**: Single Responsibility Principle
   - **O**: Open/Closed Principle
   - **L**: Liskov Substitution Principle
   - **I**: Interface Segregation Principle
   - **D**: Dependency Inversion Principle

Please refer to the below article for more details: <br/>
https://wimal-perera.medium.com/inside-the-object-oriented-toolbox-avoiding-bad-design-with-solid-principles-b8eb256c968c

6. **How SOLID Principles Are Violated During Early Sprints of an Agile Driven Project**  
   Due to lack of requirement clarity and fast delivery, it is common to see violations of the SOLID principles.

7. **Achieving Stepwise SOLID Compliance in Already Violated Implementation**  
   Gradual adherence to SOLID principles over successive sprints improves code maintainability.

### SOLID Principles Compliance

| Principle | Early Sprint Violations | Steps for Compliance |
|-----------|-------------------------|----------------------|
| **S** | Classes doing multiple things | Refactor classes to focus on one responsibility |
| **O** | Code changes require modifying existing classes | Use interfaces and inheritance to extend functionality without altering base classes |
| **L** | Child class violates base class expectations | Ensure proper override behavior and testing |
| **I** | Large interfaces with many methods | Break down large interfaces into smaller, focused ones |
| **D** | High-level modules depend on low-level modules | Introduce dependency injection to reduce coupling |

Please refer to the below article for more details: <br/>
https://medium.com/lexicon-digital/developing-agile-driven-software-whilst-adhering-with-best-engineering-practices-261a6aabe7a5

---

## Part 3: Object Oriented Design Patterns

1. **Introducing Design Patterns (Creational, Structural, and Behavioral)**  
   Design patterns are reusable solutions to common problems in software design.
2. **In-depth Analysis on Creational Design Patterns**  
   Creational patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.  
   
   **When to use:**  
   - When the system should be independent of how its objects are created, composed, and represented.
   **When not to use:**  
   - When the system doesn't need flexible object creation.

#### Types of Design Patterns

a. **Creational Design Patterns**  
   These patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. They provide flexibility in deciding which objects need to be created for a given scenario.  
   **Examples**:
   - **Factory Method**  
   - **Abstract Factory**
   - **Singleton**
   - **Builder**
   - **Prototype**

b. **Structural Design Patterns**  
   These patterns deal with object composition, creating relationships between objects to form larger structures. They help ensure that classes and objects can work together by promoting composability and reusability.  
   **Examples**:
   - **Adapter**
   - **Bridge**
   - **Composite**
   - **Decorator**
   - **Facade**
   - **Flyweight**
   - **Proxy**

c. **Behavioral Design Patterns**  
   These patterns focus on communication between objects, what happens when objects interact, and how responsibilities are distributed. They define how objects collaborate to fulfill a task.  
   **Examples**:
   - **Chain of Responsibility**
   - **Command**
   - **Interpreter**
   - **Iterator**
   - **Mediator**
   - **Memento**
   - **Observer**
   - **State**
   - **Strategy**
   - **Template Method**
   - **Visitor**

---

# Comparison Between Agile and Scrum

| **Aspect**              | **Agile**                                             | **Scrum**                                               |
|-------------------------|-------------------------------------------------------|---------------------------------------------------------|
| **Definition**           | A set of principles and values for software development, emphasizing flexibility, collaboration, and customer feedback. | A specific Agile framework that provides a structured approach to implementing Agile principles through roles, events, and artifacts. |
| **Focus**                | Agile focuses on continuous improvement, flexibility, and iterative progress. | Scrum focuses on delivering work in short, fixed-length iterations called sprints, typically 2–4 weeks long. |
| **Methodology Type**     | An umbrella term for various frameworks (Scrum, Kanban, XP, etc.) that follow Agile principles. | A specific Agile framework with defined roles, events, and artifacts. |
| **Roles**                | Roles are not defined within the Agile manifesto, and they vary depending on the methodology. | Scrum defines three roles: Product Owner, Scrum Master, and Development Team. |
| **Iterations**           | Iterative approach, but the structure of iterations varies by the Agile methodology. | Scrum follows fixed-length sprints (typically 2–4 weeks). |
| **Flexibility**          | Agile encourages flexibility in processes to adapt to changing requirements. | Scrum follows strict guidelines, but it’s flexible in terms of adapting to changing requirements during sprints. |
| **Planning**             | Agile emphasizes adaptive planning throughout the project life cycle. | Scrum involves detailed planning in the form of sprint planning, backlog grooming, and sprint reviews. |
| **Team Size**            | Agile teams are typically small, but there’s no specific size. | Scrum teams usually consist of 3 to 9 people. |
| **Customer Interaction** | Frequent customer collaboration and feedback are central to Agile. | Scrum incorporates feedback through reviews at the end of each sprint and maintains close communication with the Product Owner. |
| **Agile Manifesto**      | The Agile Manifesto focuses on values and principles that promote Agile development. | Scrum aligns with the values of the Agile Manifesto but provides more structure and specific guidelines for implementing Agile. |

## Agile Manifesto

The **Agile Manifesto** outlines the core values and principles behind Agile methodologies. It was created in 2001 by 17 software developers to promote a better way of developing software. The manifesto emphasizes:

- **Individuals and interactions over processes and tools.**
- **Working software over comprehensive documentation.**
- **Customer collaboration over contract negotiation.**
- **Responding to change over following a plan.**

You can find the full Agile Manifesto and its principles [here](https://agilemanifesto.org/).

