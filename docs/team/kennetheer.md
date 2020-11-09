# Kenneth Eer - Project Portfolio Page

## Overview
_ModTracker_ is a desktop app for NUS students to track the time spent 
as well as tasks to do for each of their modules.
It helps students to prioritise their work and 
balance their time spent amongst their modules. 
This app uses a Command Line Interface (CLI).

## Summary of Contributions

- **Code contributed:** [link](https://nus-cs2113-ay2021s1.github.io/tp-dashboard/#breakdown=true&search=&sort=groupTitle&sortWithin=title&since=2020-09-27&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other&tabOpen=true&tabType=authorship&tabAuthor=KennethEer&tabRepo=AY2021S1-CS2113T-F12-4%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code~other)

- **Enhancements implemented:**
  <br/>
  <br/>&nbsp;Summary of my implemented app functionalities:
  <br/>&nbsp;1. Addition of module and its expected workload
  <br/>&nbsp;2. Deletion of module, its expected workload and actual time
  <br/>&nbsp;3. Notification feature to notify users of their progress
  <br/>
  <br/>&nbsp;Details: 
  - Addition and Deletion of modules and its contents: 
    - Highlights: To support these core features, I created `ModuleList` and `Module` classes, 
    which manages the list of modules and each module details respectively. 
    These laid the foundation so all functionalities in the app are implemented by building upon these basic classes.
  - Notification feature:
    - What it does: When the user starts the app, it notifies him if he is spending too little/just right/too much amount of time on the module 
    and displays a randomised encouraging message.
    - Justification: This is a notable enhancement that helps _ModTracker_ achieve its objectives by immediately highlighting to the user the modules that require more attention upon the start of the app. 
    Also, displaying randomised encouraging messages improves the overall user experience significantly.
    It motivates and interests the user with these random messages, personifying _ModTracker_ as a buddy that helps 
    him with managing his module workload. This is key to differentiating _ModTracker_ from other existing applications.
    - Highlights: Integration with the analytics feature to determine user's progress for each module. 
    The app lacks an explicit indication of the user's current week number, 
    which is needed for a comparison to determine the user's progress. Hence, I implemented the logic to derive this value based on the latest week with at least one actual time input.
    <br/>
- **Documentation:**
  - User Guide:
    - Added documentations for the features `addmod`, `deletemod`, `addexp`, `deleteexp`, `open`, `deletetime`
  - Developer Guide:
    - Under the Design section, I did the following components
        - Architecture component (including architecture diagram and high level sequence diagram exemplifying the interaction between different components)
        - UI component  
        - Model Component (including class diagram)
    - Wrote implementation details of the `addMod` feature and drew activity and sequence diagrams to illustrate.
    - Contributed to the target user profile, value proposition and user stories.
    - Added in the labelling of the diagrams: [#190](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/190)
    <br/>
- **Contributions to Team-based Tasks:**
  - Conducted manual testing, reported bugs, helped to fix bugs in my team's code and refactor the code: [#42](https://github.com/AY2021S1-CS2113T-F12-4/tp/issues/42) (reported bugs), [#43](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/43) (fixed mismatch in object equality and optimised code), [#123](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/123) (used regex to implement module validity)
  - Fixed the links in the Table of Contents and formatted the tables in the User Guide: [#110](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/110/), [#109](https://github.com/AY2021S1-CS2113T-F12-4/tp/pull/109) 
  - Enabled java assertions, set up the milestones and labels in the issue tracker.
  <br/>
- **Contributions Beyond the Project Team:**
  - Provided feedback to the other teams' code and developer's guide: [#7](https://github.com/nus-cs2113-AY2021S1/tp/pull/7) 
  - Tested and reported major bugs for other teams: [#6](https://github.com/KennethEer/ped/issues/6), [#8](https://github.com/KennethEer/ped/issues/8)
