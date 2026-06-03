// Task 13: Debugging and Testing

const form = document.getElementById("registerForm");

form.addEventListener("submit", function(event) {

    // Stops page refresh
    event.preventDefault();

    // Step 1: form submitted
    console.log("Form submission started");

    // Get input values
    const userData = {
        name: document.getElementById("name").value,
        email: document.getElementById("email").value
    };

    // Step 2: inspect this variable using breakpoint
    console.log("User Data:", userData);

    // Step 3: send data to mock API
    fetch("https://jsonplaceholder.typicode.com/posts", {
        method: "POST",
        body: JSON.stringify(userData),
        headers: {
            "Content-Type": "application/json"
        }
    })

    .then(function(response) {
        console.log("Fetch request sent");
        return response.json();
    })

    .then(function(data) {
        console.log("Server Response:", data);
        document.getElementById("message").innerHTML =
        "Registration request completed";
    })

    .catch(function(error) {
        console.log("Error Found:", error);
        document.getElementById("message").innerHTML =
        "Registration failed";
    });
});