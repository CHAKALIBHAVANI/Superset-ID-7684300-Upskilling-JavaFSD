// Task 11: Working with Forms

// Access form
const form = document.getElementById("eventForm");

form.addEventListener("submit", function(event) {

    // Prevent page refresh
    event.preventDefault();

    // Get input values using form.elements
    let name = form.elements["userName"].value;
    let email = form.elements["userEmail"].value;
    let eventName = form.elements["eventName"].value;

    // Validate inputs
    if (name === "" || email === "" || eventName === "") {

        // Show error message
        document.getElementById("error").innerHTML =
        "Please fill all fields";

    } else {

        // Clear error message
        document.getElementById("error").innerHTML = "";

        // Show success message
        document.getElementById("eventDetails").innerHTML =
        "Registration Successful";
    }
});