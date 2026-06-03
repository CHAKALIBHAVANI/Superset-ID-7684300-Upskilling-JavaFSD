// Task 13: Debugging and Testing

// Store user data
let userName = "Bhavani";
let email = "bhavani@gmail.com";

// Check variable values
console.log("User Name:", userName);
console.log("Email:", email);

// Form submission step
console.log("Form Submitted");

// Data sent to API
let userData = {
    name: userName,
    email: email
};

// Check payload data
console.log("Payload:", userData);

// Fetch request
fetch("https://jsonplaceholder.typicode.com/posts", {
    method: "POST",
    body: JSON.stringify(userData),
    headers: {
        "Content-Type": "application/json"
    }
})

.then(function(response) {

    // Request success
    console.log("Request Sent");

    return response.json();
})

.then(function(data) {

    // Response received
    console.log("Response Received");
})

.catch(function(error) {

    // Error found
    console.log("Error:", error);
});