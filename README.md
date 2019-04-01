# Inheritance Lab.

The task is to model and create a system to store information for employees of a large development company.
TDD, inheritance, packages and abstract classes were used for this.

#### Create an abstract `staff.Employee` parent class in a package called staff.
- `staff.Employee` will have a name, NI number and salary. :white_check_mark:
- Create Getters for all properties. :white_check_mark:
- Add a method named `raiseSalary` with takes in a parameter of type double to increment the salary. :white_check_mark:
- Add a method called `payBonus` which returns 1% of the employees salary. :white_check_mark:
- Don't worry about testing just now until you create the subclasses.

#### Create a subclass of `staff.Employee` called `Manager` in a package called management.
- Create a class for Manager. :white_check_mark:
- Add a property to store the department name in a property called `deptName`. :white_check_mark:
- Create a constructor that includes all the parameters needed for `staff.Employee` and `deptName`. :white_check_mark:
- Add a getter method for `deptName`. :white_check_mark:
- Test all methods including `raiseSalary` and `payBonus`. :white_check_mark:

#### Create subclasses of `staff.Employee`: `Developer` and `DatabaseAdmin` in a package called techStaff.
Create 2 new classes for `Developer` and `DatabaseAdmin`. :white_check_mark:
- These should take in the same parameters as `staff.Employee` and pass them to `staff.Employee` constructor. :white_check_mark:
- Again test all methods for both classes. :white_check_mark:

#### Create a subclass of `Manager` called `Director` in the management package.
- Add a private property to store a double value `budget`. :white_check_mark:
- Create a constructor for `Director` that includes the parameters needed for `Manager` and the `budget` parameter. :white_check_mark:
- Create a getter method for this property.
- Test all methods.


## Extensions

### Prevent unwanted values

- Prevent a negative value for the `raiseSalary` method.
- Allow the user to change the Employees name and prevent a null value from being entered.
- Override the `payBonus` in director to return 2% of their salary.
