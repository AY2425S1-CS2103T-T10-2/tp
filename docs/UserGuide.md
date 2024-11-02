---
  layout: default.md
  title: "User Guide"
  pageNav: 3
---
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200&icon_names=chevron_right" />

<style>
  @import url('https://fonts.googleapis.com/css2?family=DM+Sans:ital,opsz,wght@0,9..40,100..1000;1,9..40,100..1000&family=Nunito:ital,wght@0,200..1000;1,200..1000&display=swap');

  :root {
    --primary-bg-color: rgb(248, 248, 248);
    --special-bg-color: rgb(235, 243, 255);
    --hover-bg-color: rgb(243, 243, 243);
    --white-bg-color: rgb(255, 255, 255);
    --code-bg-color: rgba(202, 206, 255, 0.6);
    --box-bg-color: rgba(255, 130, 21, 0.6);
    --box-border-color: rgba(255, 130, 21, 0.75);
    --warn-bg-color: rgba(255, 0, 0, 0.2);
    --warn-border-color: rgba(255, 0, 0, 0.4);
    --border-color: rgb(220, 220, 220);
    --black-color: rgb(0, 0, 0);
  }

  .ug {
    font-family: 'DM Sans', sans-serif;
    transition: 0.2s ease;
  }

  .box {
    background-color: var(--box-bg-color) !important;
    padding: 8px 16px;
    margin: 16px 0;
    border-radius: 5px;
    border: 2px solid var(--box-border-color);
  }

  .box-warn {
    background-color: var(--warn-bg-color) !important;
    padding: 16px 32px;
    border: 2px solid var(--warn-border-color);
  }

  .box > p {
    margin: 0;
  }

  .headers {
    font-weight: 900;
  }

  .headers-first {
    margin-top: 72px;
  }

  .content {
    background-color: var(--primary-bg-color);
    border-radius: 10px;
    padding: 32px;
    margin: 16px;
  }

  .sub-content {
    padding: 16px;
  }

  .content-special {
    background-color: var(--special-bg-color);
  }

  .content-droppable {
    padding: 24px 32px 16px 32px;
    margin: 0px 16px;
    font-size: 1.2em;
    border-top: 1px solid var(--border-color);
    background-color: var(--white-bg-color);
    border-radius: 0px;
  }

  .content-droppable:hover {
    background-color: var(--hover-bg-color);
  }

  .content-qna {
    padding: 24px 32px;
    font-size: 0.9em;
  }

  .content-command {
    background-color: var(--white-bg-color);
    padding: 8px;
  }

  summary {
    cursor: pointer;
    margin-bottom: 8px;
    display: flex;
    transition: 0s ease;
    font-size: 1.2em;
  }

  details[open] > summary > .chevrons {
    transform: rotate(270deg);
  }

  code {
    color: var(--black-color) !important;
    background-color: var(--code-bg-color) !important;
  }

  .chevrons {
    transform: rotate(90deg) translateX(0px);
    text-decoration: none;
    background-color: transparent !important;
    margin: auto;
    margin-right: 0;
  }

  .command-content {
    padding: 24px 16px 8px 16px;
    font-size: 0.8em;
  }

  .qna-content {
    padding: 16px 16px 0px 16px;
  }

  .toc-content {
    padding: 0;
  }

  .toc-btns {
    background-color: rgba(255, 255, 255, 0);
    border: none;
    border-top: 1px solid var(--border-color);
    font-family: 'DM Sans', sans-serif;
    border-bottom: none;
    border-radius: 0px;
    color: black;
    padding: 24px;
    text-align: left;
    text-decoration: none;
    font-size: 16px;
    font-weight: bold;
    cursor: pointer;
    width: 100%;
    text-align: left;
    position: relative;
  }

  .toc-btns > span {
    position: relative;
    z-index: 5;
  }

  .toc-btns::before {
    content: "";
    top: 0;
    left: 0;
    position: absolute;
    width: 10px;
    height: 100%;
    background: linear-gradient(90deg, var(--code-bg-color) 0%, var(--primary-bg-color) 50%);
    transition: width 0.3s ease;
    z-index: 0;
    margin-left: 0;
  }

  .toc-btns-first, .content-droppable-first, .toc-btns-first::before {
    border: none;
    border-top-left-radius: 10px;
    border-top-right-radius: 10px;
  }

  .toc-btns-last, .content-droppable-last, .toc-btns-last::before {
    border-bottom-left-radius: 10px;
    border-bottom-right-radius: 10px;
  }

  .toc-btns:hover::before {
    width: calc(100%);
    background: linear-gradient(90deg, var(--code-bg-color) 0%, var(--primary-bg-color) 50%);
  }

  .last-component {
    margin-bottom: 96px;
  }
</style>

<div class="ug">

<h1 class="headers headers-first">StaffSync User Guide</h1>

<p class="content content-special">
  StaffSync is a <strong>desktop app for managing potential hires and employees, optimized for use via a  Line Interface</strong> (CLI) while still having the benefits of a Graphical User Interface (GUI). If you can type fast, StaffSync can get your contact management tasks done faster than traditional GUI apps.
</p>

<br>

<h1 class="toc headers">Table of Contents</h1>

<div class="content toc-content">
  <a href="#installation-and-quick-start">
    <button class="toc-btns toc-btns-first"><span>1. Installation and Quick Start</span></button>
  </a>
  <a href="#commands">
    <button class="toc-btns"><span>2. Commands</span></button>
  </a>
  <a href="#command-summary">
    <button class="toc-btns"><span>3. Commands Summary</span></button>
  </a>
  <a href="#features">
    <button class="toc-btns"><span>4. Features</span></button>
  </a>
  <a href="#faq">
    <button class="toc-btns"><span>5. FAQ</span></button>
  </a>
  <a href="#known-issues">
    <button class="toc-btns toc-btns-last"><span>6. Known Issues</span></button>
  </a>
</div>

<br>

<h1 class="headers" id="installation-and-quick-start">Installation and Quick Start</h1>


<div class="content">

<strong>1. </strong>Ensure you have [Java `17`](https://www.oracle.com/java/technologies/downloads/#java17) installed in your Computer. Higher versions may work but we do not officially support it.

<br>

<strong>2. </strong>Download the latest release `.jar` file from [our Github page](https://github.com/AY2425S1-CS2103T-T10-2/tp/releases).

<br>

<strong>3. </strong>Copy the file to the folder you want to use as the _home folder_ for your StaffSync.

<br>

<strong>4. </strong>Open a command terminal, `cd` into the folder you put the jar file in, and use the `java -jar staffSync.jar` command to run the application.<br>

   Alternatively, you can double-click the jar file to run the application (though we do not officially support it).

   A GUI similar to the below should appear in a few seconds. Note how the app contains some sample data.<br>
   ![Ui](images/Ui.png)

<br>

<strong>5. </strong>Type the command in the command box and press Enter to execute it. e.g. typing **`help`** and pressing Enter will open the help window.<br>
   Some example commands you can try:

   * `list ph` : Lists all potential hires.

   * `employee n/John Doe p/81234567 e/pohjunkang@gmail.com a/21 Lower Kent Ridge Rd d/Department of communications and informatics r/Head of communications and Informatics ced/2021-01-01` : Adds an employee named `John Doe` to StaffSync.

   * `delete ph 1` : Deletes the 1st person shown if they are a potential hire.

   * `clear` : Deletes all contacts.

   * `exit` : Exits the app.

<br>

<strong>6. </strong>Refer to the [Commands](#commands) below for details of each command.

</div>

<br>

<h1 class="headers" id="commands">Commands</h1>


<div class="content content-special">

**Notes about the command format:**

<br>

* Words in `UPPER_CASE` are the parameters to be supplied by the user.
  e.g. in `employee n/NAME`, `NAME` is a parameter which can be used as `employee n/John Doe`.
  <br>
* Items in square brackets are optional.
  e.g. `edit INDEX [n/NAME] [e/EMAIL]` can be used as `edit 1 n/John Doe e/johndoe@gmail.com` or `edit 1 n/John Doe`.
  <br>
* Parameters can be in any order.
  e.g. if the command specifies `n/NAME p/PHONE_NUMBER`, `p/PHONE_NUMBER n/NAME` is also acceptable.
  <br>
* Parameters and commands are case-sensitive
  e.g. the command `Help` and `edit 1 N/John Doe` will return an error
  <br>
* Extraneous parameters for commands that do not take in parameters (such as `help`, `exit` and `clear`) will be ignored.
  e.g. if the command specifies `help 123`, it will be interpreted as `help`.
  <br>
* If you are using a PDF version of this document, be careful when copying and pasting commands that span multiple lines as space characters >surrounding line-breaks may be omitted when copied over to the application.

</div>


<div class="content content-droppable content-droppable-first">

<details>
  <summary>
    <strong>Clearing all entries<br><code>clear</code></strong>
    <span class="material-symbols-outlined chevrons">
      chevron_right
    </span>
  </summary>

  <div class="command-content">
  Clears all entries from StaffSync.

  <br>
  <br>

  Format: `clear`
  </div>
</details>

</div>
<div class="content content-droppable">

<details>
  <summary><strong>Deleting a person<br><code>delete</code></strong>
    <span class="material-symbols-outlined chevrons">
      chevron_right
    </span>
  </summary>

  <div class="command-content">
  Deletes the specified person from StaffSync.

  <br>
  <br>

  Format: `delete ph INDEX` or `delete e INDEX` *(Note the `ph` or `e` parameter. `ph` refers to potential hires and `e` refers to employees)*

  * Deletes the potential hire/employee at the specified `INDEX`.
  * The index refers to the index number shown in the displayed person list.
  * The index **must be a positive integer** 1, 2, 3, …​
  * The index **must be within the size of the list** of potential hires/employees shown.

  Examples:
  * `list` followed by `delete e 2` deletes the 2nd person in the employee list.
  * `find e Betsy` followed by `delete e 1` deletes the 1st employee in the results of the `find` command.
  </div>
</details>

</div>
<div class="content content-droppable">
<details>
  <summary><strong>Demoting a person<br><code>demote</code></strong>
    <span class="material-symbols-outlined chevrons">
      chevron_right
    </span>
  </summary>

  <div class="command-content">
  Demotes the specified employee from StaffSync into a potential hire.

  <br>
  <br>

  Format: `demote INDEX`

  * Demote the employee at the specified `INDEX` to a potential hire.
  * The index refers to the index number shown in the displayed person list.
  * The index **must be a positive integer** 1, 2, 3, …​
  * The index **must be within the size of the list** shown.
  * The person at the index must be an employee

  Examples:
  * `list e` followed by `demote 2` demotes the 2nd person in the employee list.
  * `find e Betsy` followed by `demote 1` demotes the 1st employee in the results of the `find` command.

  <div class="box box-warn" type="warning" seamless>

  **Common Mistakes:**
  * `list ph` followed by `demote 2` - cannot demote a potential hire
  * `demote 0` - invalid index number
  * `demote 3` but only have 2 entries - invalid index number, index out of list size
  </div class="box">
  </div>

</details>

</div>
<div class="content content-droppable">

<details>
  <summary><strong>Editing a person<br><code>edit</code></strong>
    <span class="material-symbols-outlined chevrons">
      chevron_right
    </span>
  </summary>

  <div class="command-content">
  Edits an existing person in the StaffSync.

  <br>
  <br>

  Format: `edit INDEX [n/NAME] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [d/DEPARTMENT] [r/ROLE] [ced/CONTRACT_END_DATE]`

  * Edits the person at the specified `INDEX`. The index refers to the index number shown in the displayed person list. The index **must be a positive integer** 1, 2, 3, …​
  * At least one of the optional fields must be provided.
  * Existing values will be updated to the input values.

  <div class="box" type="tip" seamless>

  **Tip:** It is not possible to edit the contract end date of a potential hire
  </div class="box">

  Examples:
  *  `edit 1 p/91234567 e/johndoe@example.com` Edits the phone number and email address of the 1st person to be `91234567` and `johndoe@example.com` respectively.
  *  `edit 2 n/Betsy Crower t/` Edits the name of the 2nd person to be `Betsy Crower` and clears all existing tags.
  </div>
</details>

</div>
<div class="content content-droppable">

<details>
  <summary><strong>Adding an employee<br><code>employee</code></strong>
    <span class="material-symbols-outlined chevrons">
      chevron_right
    </span>
  </summary>


  <div class="command-content">
  Adds an employee to StaffSync.

  <br>
  <br>

  Format: `employee n/NAME p/PHONE_NUMBER a/ADDRESS e/EMAIL d/DEPARTMENT r/ROLE ced/CONTRACT_END_DATE`

  <div class="box" type="tip" seamless>

  **Tip:** All fields are mandatory
  </div class="box">

  Examples:
  * `employee n/Jun Kang p/81234567 a/21 Lower Kent Ridge Rd e/pohjunkang@gmail.com d/Department of communications and informatics r/Head of communications and Informatics ced/2021-01-01`
  </div>
</details>

</div>
<div class="content content-droppable">

<details>
  <summary><strong>Exiting the program<br><code>exit</code></strong>
    <span class="material-symbols-outlined chevrons">
      chevron_right
    </span>
  </summary>

  <div class="command-content">
  Exits the program.

  <br>
  <br>

  Format: `exit`
  </div>
</details>

</div>
<div class="content content-droppable">

<details>
  <summary><strong>Locating persons by name<br><code>find</code></strong>
    <span class="material-symbols-outlined chevrons">
      chevron_right
    </span>
  </summary>

  <div class="command-content">
  Finds all employees and/or potential hires whose names contain any of the specified keywords.

  <br>
  <br>

  Format: `find PARAMETER KEYWORD [MORE_KEYWORDS]`

>Parameter: `e` for employees, `ph` for potential hires, `all` for both employees and potential hires
>
>Keywords: `n/[NAMES]` `p/[PHONE NUMBERS]` `e/[EMAILS]` `d/[DEPARTMENTS]` `r/[ROLES]`

<div class="box" type="tip" seamless>

**Tip:** At least one keyword is required.
  </div class="box">

* Only name, phone number, email, department and role can be searched.
* Only full words will be matched. e.g. `find e n/Han` will not match `find e n/Hans`.
* The search is case-insensitive. e.g. `find all n/hans` will match `find all n/Hans`.
* Allows for searching of multiple fields. e.g. `find all n/alice p/12345678 e/alice@example.com` returns persons
with name `alice`, with phone number `123445678` and with email `alice@example.com`.
* The order of the keywords does not matter. e.g. `find all e/alice@example.com bob@example.com` will match
`find all e/bob@example.com alice@example.com`.
* The order of the keywords prefixes does not matter. e.g. `find all n/john e/john@example.com` will match 
`find all e/john@example.com n/john`.
* Persons matching at least one keyword in every field specified will be returned.
e.g. `find e n/Hans Bo p/12345678 87654321` will return employees with name either `Hans` or `Bo`,
and with phone number either `12345678` or `87654321`.


  Examples:
  * `find all n/John p/12345678` returns persons with `John` in their name, and with phone number `12345678`
  * `find e p/12345678 e/john@example.com alice@example.com` returns employees with phone number `12345678` and with
  email either `john@example.com` or `alice@example.com`
  * `find ph d/IT r/SWE Manager` returns potential hires with department `IT`, and role either `SWE` or `Manager`

Example: "find ph n/John".
![result for 'find alex david'](images/findjohnResult.png)

   <div class="box box-warn" type="warning" seamless>

**Common Mistakes:**
* `find a n/John`: Invalid parameter
* `find all a/John`: Invalid keyword prefix
* `find all n/John n/John`: Duplicate keyword prefix
  </div class="box">

  </div>
</details>

</div>
<div class="content content-droppable">

<details>
  <summary><strong>Viewing help<br><code>help</code></strong>
    <span class="material-symbols-outlined chevrons">
      chevron_right
    </span>
  </summary>

  <div class="command-content">
  Displays a help window containing the list of commands, its purpose and the format

  <br>
  <br>

  ![Ui](images/helpWindow.png)

  Format:`help`
  </div>
</details>

</div>
<div class="content content-droppable">

<details>
  <summary><strong>Listing all persons<br><code>list</code></strong>
    <span class="material-symbols-outlined chevrons">
      chevron_right
    </span>
  </summary>

  <div class="command-content">
  Shows a list of all persons in StaffSync.

  <br>
  <br>

  Format: `list all` or `list ph` or `list e` *(Note the `ph` or `e` parameter. `ph` refers to potential hires and `e` refers to employees)*
  * Lists type of persons based on the parameter given.
  </div>
</details>

</div>
<div class="content content-droppable">

<details>
  <summary><strong>Adding a potential hire<br><code>potential</code></strong>
    <span class="material-symbols-outlined chevrons">
      chevron_right
    </span>
  </summary>

  <div class="command-content">
  Adds a potential hire to StaffSync.

  <br>
  <br>

  Format: `potential n/NAME p/PHONE_NUMBER a/ADDRESS e/EMAIL d/DEPARTMENT r/ROLE`

  <div class="box" type="tip" seamless>

  **Tip:** All fields are mandatory
  </div class="box">

  Examples:
  * `potential n/Jun Kang p/81234567 a/21 Lower Kent Ridge Rd e/pohjunkang@gmail.com d/Department of communications and informatics r/Head of communications and Informatics`
  </div>
</details>

</div>
<div class="content content-droppable content-droppable">

<details>
  <summary><strong>Promoting a person<br><code>promote</code></strong>
    <span class="material-symbols-outlined chevrons">
      chevron_right
    </span>
  </summary>

  <div class="command-content">
  Promotes the specified potential hire from StaffSync into an employee.

  <br>
  <br>

  Format: `promote INDEX CONTRACT_END_DATE`

  * Promote the potential hire at the specified `INDEX` to an employee with the specified `CONTRACT_END_DATE`.
  * The index refers to the index number shown in the displayed person list.
  * The index **must be a positive integer** 1, 2, 3, …​
  * The index **must be within the size of the list** shown.
  * The person at the index must be a potential hire
  * The contract end date must be of **valid format** of yyyy-MM-dd

  Examples:
  * `list p` followed by `promote 2 2025-12-20` promotes the 2nd person in the potential hire list with a contract end date of 20 Dec 2025.
  * `find p n/Betsy` followed by `promote 1 2025-12-20` promotes the 1st potential hire in the results of the `find` command with a contract end date of 20 Dec 2025.

  <div class="box box-warn" type="warning" seamless>

  **Common Mistakes:**
  * `promote 2 12-20-2025` - the contract end date is in the wrong date format
  * `promote 2 2025-20-12` - the day and the month of the contract end date is swapped
  * `list e` followed by `promote 2 2025-12-20` - cannot promote an employee
  * `promote 0 2025-12-20` - invalid index number
  * `promote 3 2025-12-20` but only have 2 entries - invalid index number, index out of list size
  </div class="box">
  </div>
</details>

</div>
<div class="content content-droppable content-droppable-last">

<details>
  <summary><strong>Sorting the list<br><code>sort</code></strong>
    <span class="material-symbols-outlined chevrons">
      chevron_right
    </span>
  </summary>

  <div class="command-content">
  Sorts the list in ascending order by the given parameter.

  <br>
  <br>

  Format: `sort name` or `sort date`

  Sorts the list by either the name of the contact or the contract end date.
  * `name` will sort the list based on the names of the contacts in alphabetical order.
  * Note that `name` will only sort the ***visible*** contents of the list.
  * Contacts that have been filtered will not show up when `sort name` is called.
  * `date` will sort the list based on the contract end dates of the employees in ascending order.
  * Note that `date` will filter out potential hires from the list as they do not have a contract end date.
  * `date` will show all employees and not just potential hires.

  Examples:
  * `sort name` sorts all contacts by name.
  * `sort date` shows all employees and sorts by contract end date
</details>

</div>

<br>






<h1 class="headers" id="command-summary">Commands Summary</h1>

<div class="content content-command">

Action     | Format                                                                                        | Examples
-----------|-----------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------
**Clear**  | `clear`                                                                                       |
**Delete** | `delete e INDEX` <br> `delete ph INDEX`                                                       | `delete e 3`<br> `delete ph 1`
**Demote** | `demote INDEX`                                                                                | `demote 2`
**Edit**   | `edit INDEX [n/NAME] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [d/DEPARTMENT] [r/ROLE] [ced/CONTRACT_END_DATE]` | `edit 2 n/James Lee e/jameslee@example.com`
**Employee**| `employee n/NAME p/PHONE_NUMBER a/ADDRESS e/EMAIL d/DEPARTMENT r/ROLE ced/CONTRACT_END_DATE​` | `employee n/Jun Kang p/81234567 a/21 Lower Kent Ridge Rd e/pohjunkang@gmail.com d/Department of communications and informatics r/Head of communications and Informatics ced/2021-01-01`
**Exit**   | `exit`                                                                                        |
**Find**   | `find all [KEYWORDS]` <br> `find e [KEYWORDS]` <br> `find ph [KEYWORDS]`                      | `find all Jake` <br> `find e Jake` <br> `find ph Jake`
**Help**   | `help`                                                                                        |
**List**   | `list all` <br> `list e` <br> `list ph`                                                       |
**Potential Hire**| `potential n/NAME p/PHONE_NUMBER a/ADDRESS e/EMAIL d/DEPARTMENT r/ROLE​`                | `potential n/Jun Kang p/81234567 a/21 Lower Kent Ridge Rd e/pohjunkang@gmail.com d/Department of communications and informatics r/Head of communications and Informatics`
**Promote** | `promote INDEX CONTRACT_END_DATE`                                                            | `promote 2 2025-12-20`
**Sort**   | `sort name` <br> `sort date`                                                                  |


</div>

<br>

<h1 class="headers" id="features">Features</h1>

<div class="content">

### **Saving the data**

<div class="sub-content">

StaffSync data are saved in the hard disk automatically after any command that changes the data. There is no need to save manually.

</div>
<br>

### **Editing the data file**
<div class="sub-content">

  StaffSync data are saved automatically as a JSON file `[JAR file location]/data/addressbook.json`. Advanced users are welcome to update data directly by editing that data file.

<div class="box box-warn" type="warning" seamless>

**Caution:**
If your changes to the data file makes its format invalid, StaffSync will discard all data and start with an empty data file at the next run.  Hence, it is recommended to take a backup of the file before editing it.<br>
Furthermore, certain edits can cause the StaffSync to behave in unexpected ways (e.g., if a value entered is outside the acceptable range). Therefore, edit the data file only if you are confident that you can update it correctly.
</div class="box">

</div>
<br>
<br>

### **Archiving data files `[coming in v2.0]`**
<div class="sub-content">

_Details coming soon ..._

</div>
</div>

<br>

<h1 class="headers" id="faq">FAQ</h1>

<div class="content content-qna">

<details>
  <summary><strong>Q: How do I transfer my data to another Computer?</strong>
    <span class="material-symbols-outlined chevrons">
      chevron_right
    </span>
  </summary>

  <div class="qna-content">

  <strong>A: </strong>Install the app in the other computer and overwrite the empty data file it creates with the file that contains the data of your previous StaffSync home folder.

  </div>
</details>

</div>

<br>

<h1 class="headers" id="known-issues">Known Issues</h1>

<div class="content">

1. **When using multiple screens**, if you move the application to a secondary screen, and later switch to using only the primary screen, the GUI will open off-screen. The remedy is to delete the `preferences.json` file created by the application before running the application again.
<br>
2. **If you minimize the Help Window** and then run the `help` command (or use the `Help` menu, or the keyboard shortcut `F1`) again, the original Help Window will remain minimized, and no new Help Window will appear. The remedy is to manually restore the minimized Help Window.

</div>

<div class="last-component"></div>

</div>
