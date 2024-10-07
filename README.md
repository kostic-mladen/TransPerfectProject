QA Project v1.01 – TransPerfectTask

This project contains automated tests for web elements using Selenium WebDriver. 
The tests aim to verify specific functionality of a dialog box in a web application.

Task 1: Verify Dialog Functionality

The following steps outline the tests performed in Task 1:
1. Open URL:
   - The test opens the provided URL using Selenium WebDriver.
2. Click on Open Dialog button:
   - The test finds and clicks the "Open Dialog" button on the page to display the dialog.
3. Verify dialog elements:
   - Once the dialog is open, the test verifies the presence of specific elements within the dialog (e.g., title, text, buttons).
4. Verify background color of the Yes button:
   - The test checks the background color of the "Yes" button in the dialog to ensure it meets the expected design.
5. Put focus on “x”:
   - The test moves focus to the close button ("x") on the dialog
6. Close dialog on Enter key:
   - The test simulates pressing the `Enter` key when the dialog is focused to close it.
7. Verify Dialog is closed:
   - The test verifies that the dialog is no longer visible after it is closed.
---
Task 2: Verify Window Functionality

The following steps outline the tests performed in Task 2:

1. Open URL:
    - The test opens the provided URL using Selenium WebDriver.

2. Click on Open Window button:
    - The test finds and clicks the "Open Window" button on the page to display the window.

3. **Verify data from window**:
    - Once the window is open, the test verifies the presence of specific elements in the window (e.g., name, buttons, text).

4. **Maximize window**:
    - The test clicks the maximize button to expand the window.

5. **Verify Maximize button is not visible**:
    - After maximizing the window, the test verifies that the maximize button is no longer visible (since the window is already maximized).

6. **Close window**:
    - The test finds the close button on the window and closes the window.

7. **Verify window is closed**:
    - The test verifies that the window is no longer visible after it is closed.
---
Task3: Verify and Export Employee Data

The following steps outline the tests performed in Task 3:

1. Open URL: The test opens the provided URL.
2. Find all employees that are from the USA:
    - The test locates and prints all employees whose country is listed as "USA."
    - For each employee, the test prints their **Name**, **Job Title**, **Phone Number**, and **Address**.

3. Export in Excel table all employees from the USA that are Online:
   - The test filters the employees from the USA who are online and exports them into an Excel file named `export_`.
4. Verify exported employees from Excel table (Pending):
   - This step is currently not completed.
   - The goal is to verify that the exported Excel file contains the correct data.
---
Task 4: Verify Autocomplete Input Field

The following steps outline the tests performed in Task 4:

1. Open URL: The test opens the provided URL.
2. Choose a favorite sport in the autocomplete input field: The test interacts with the autocomplete field and selects a favorite sport.
3. Verify chosen result: The test verifies that the correct sport was selected from the autocomplete suggestions.
4. Clear the chosen sport using “x”: The test clicks the "x" button to clear the selected sport from the field.
---
Task 5: Verify Multiselect Input Field

The following steps outline the tests performed in Task 5:

1. Open URL: The test opens the provided URL.
2. Open the dropdown and verify options: The test opens the multiselect dropdown and verifies the available options.
3. Choose Tennis and Football as favorite sports: The test selects both Tennis and Football from the multiselect dropdown.
4. Verify chosen results: The test verifies that both Tennis and Football were correctly selected from the dropdown.
---
Assumptions

Task1:

The following assumptions were made during the creation of the tests:
- The URL to be tested is provided and accessible without any user authentication.
- The dialog box and its elements (buttons, text) are properly loaded when clicking the "Open Dialog" button.
- The Yes button's background color is stable and remains the same during the test execution.
- The "x" button for closing the dialog can receive focus and responds to the `Enter` key press.
- The dialog can be closed either by clicking the close button or pressing the `Enter` key.

Task2:
- The window elements (name, buttons, and text) are loaded when the "Open Window" button is clicked.
- The maximize button is expected to be hidden when the window is maximized.
- The close button on the window properly closes the window, and the window disappears from the view after closing.

Task3:
- Employees from the USA are properly filtered based on their country.
- Employee details (Name, Job Title, Phone Number, and Address) are displayed correctly and can be extracted.

Task 4 and Task 5:
- The autocomplete and multiselect input fields load correctly and allow selecting sports.
- The selection of sports from the dropdown or autocomplete field behaves as expected.
- The "x" button properly clears the selected sport from the input field.

Running the Tests

Prerequisites:
- Ensure you have the following installed:
  - Java
  - Maven
  - Selenium WebDriver
  - ChromeDriver
---
Steps to Run the Tests:

Clone the repository:
   ```bash
   git clone



