// Task 12: AJAX & Fetch API

// Access form
const form = document.getElementById("registerForm");

form.addEventListener("submit", function(event) {

    // Stop page refresh
    event.preventDefault();

    // Show message
    document.getElementById("message").innerHTML =
    "Sending...";

    // Delay response
    setTimeout(function() {

        // Send data to mock API
        fetch("https://jsonplaceholder.typicode.com/posts", {
            method: "POST"
        })

        // Success
        .then(function() {
            document.getElementById("message").innerHTML =
            "Registration Successful";
        })

        // Error
        .catch(function() {
            document.getElementById("message").innerHTML =
            "Registration Failed";
        });

    }, 2000);
});