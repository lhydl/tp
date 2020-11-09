# Lee Hao Yuan - Project Portfolio Page

## Project: ModTracker
_ModTracker_ is a desktop app for NUS students to track the time spent 
as well as tasks to do for each of their modules.
It helps students to prioritise their work and 
balance their time spent amongst their modules. 
This app uses a Command Line Interface (CLI).


## Summary of Contributions
The following subsections detail my contributions in this project.

### Code Contributed
* All the code contributed by me in this project can be found in this 
[RepoSense link](https://nus-cs2113-ay2021s1.github.io/tp-dashboard/#breakdown=true&search=lhydl&sort=groupTitle&sortWithin=title&since=2020-09-27&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other).

### New Features Implemented
* Implemented the main ModTracker class that acts as an entry point to this program, as well as the Parser and Ui classes.
The Parser class parses and handles user input and calls the correct methods to perform the necessary logics.
The Ui class handles the user interface of the program. 
(Pull request [#7](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/7))

* Implemented part of the user interface of this program, which includes implementing the help list,
creating the welcome screen logo as well as the exit screen. 
(Pull requests [#28](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/28), 
[#29](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/29))

* Implemented a feature where users can add tasks under an existing module, as well as 
managing the tasks such as marking a task as done or deleting a task. The users are able to see the tasks linked to a 
specific module with the list task feature. The add task feature will check if the module code 
entered by the user is valid or pre-exist in the module list by calling relevant methods in the
ModuleList class. All these implementations are handled in the Task and TaskList classes. 
(Pull requests [#73](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/73), 
[#88](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/88),
[#96](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/96))

    * Rationale: Value adds our app as most students who use our app will most likely want to have a planner functionality
     within our app to track their tasks related to the modules as well.

### Enhancements Implemented
* Added more Junit tests to improve coverage. 
(Pull requests [#50](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/50),
 [#178](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/178))

* Implemented exception handlings and messages for different types of errors. 
(Pull requests [#53](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/53),
[#119](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/119))

### Contributions to User Guide
* Created the general structure and format of the user guide. 
(Pull requests [#64](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/64), 
[#65](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/65))

* Added the details of the `help`, `addtask`, `listtask`, `done`, `deletetask` and `exit` features (Section 2.1, 2.12-2.15, and 2.20). 
(Pull request [#98](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/98))


### Contributions to the Developer Guide
* Added the `Setting Up, Getting Started` (Section 2) section of the developer guide. 
(Pull request [#124](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/124))

* Added the implementations of the `Add Task` (Section 4.8) and `Mark Task as Done` (Section 4.9) features. 
(Pull request [#76](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/76))

* Added two sequence diagrams under the `Add Task` and `Mark Task as Done` sections respectively. 
(Pull request [#111](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/111))

### Contributions to Team-based Tasks
* Released the jar file for V1.0 and did some other submissions. 

* Maintained the milestones and issues in our repo. 

* Updating both the user and developer guides that are not specific to my features and enhancements.
(Pull requests [#65](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/65),
[#107](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/107), 
[#113](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/113), 
[#121](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/121), 
[#171](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/171), 
[#200](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/200))

* Fixed bugs in the code that are not specific to my features and enhancements. 
(Pull requests [#59](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/59))

### Contributions Beyond the Project Team
* Gave constructive reviews to the pull request of other teams. The reviews include feedback on their documentations. 
([Link](https://github.com/nus-cs2113-AY2021S1/tp/pull/10))

* Reported bugs on the program of the other teams that I reviewed. ([Link](https://github.com/lhydl/ped/issues))


[Home Page](https://ay2021s1-cs2113t-f12-4.github.io/tp/)