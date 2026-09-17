# Java Factory Patterns - Vehicle Manufacturing Assignment

A simple Java project demonstrating the Factory Method and Abstract Factory design patterns. It builds different vehicle types (`TwoWheeler` and `FourWheeler`) and their matching component families.

## Project Structure

* **`factory_method/`**
    * `Vehicle.java`: Product interface defining the assembly contract.
    * `TwoWheeler.java` & `FourWheeler.java`: Concrete vehicle products.
    * `VehicleFactory.java`: Abstract creator declaring `createVehicle()` and business logic.
    * `TwoWheelerFactory.java` & `FourWheelerFactory.java`: Concrete creators that instantiate specific vehicles.

* **`abstract_factory/`**
    * `Engine.java` & `SafetyFeature.java`: Product family interfaces.
    * `BikeEngine.java`, `CarEngine.java`, `Helmet.java`, `Seatbelt.java`: Concrete component parts.
    * `VehicleFactory.java`: Abstract factory interface defining factory methods for components.
    * `TwoWheelerFactory.java` & `FourWheelerFactory.java`: Concrete factories producing matching sets of parts.

* `Main.java`: Client code demonstrating execution of both design patterns.

## Rules & Features

* **Factory Method (Part A):** Decouples object creation from client code by letting factory subclasses decide which concrete vehicle to instantiate.

* **Abstract Factory (Part B):** Produces whole families of related products (`Engine` + `SafetyFeature`) to guarantee component compatibility without binding code to concrete classes.

* **Polymorphic Design:** Follows OOD principles for clean separation of responsibilities.

## How to Run

1. Open the project in **IntelliJ IDEA** (or any Java IDE).

2. Open `Main.java` located in `src/com/aitu/vehicle/`.

3. Click the green **Run** button next to the main method (or press `Shift + F10`).