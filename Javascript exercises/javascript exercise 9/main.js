// Task 9: Async JS, Promises, Async/Await

// Access HTML elements
const loading = document.getElementById("loading");
const eventDetails = document.getElementById("eventDetails");

// Mock JSON API endpoint
const apiURL = "https://jsonplaceholder.typicode.com/users";

// Promise method: then() and catch()
fetch(apiURL)
    .then(function(response) {
        return response.json(); // Convert API data to JSON
    })
    .then(function(data) {
        console.log("Data fetched successfully");
    })
    .catch(function(error) {
        console.log("Error while fetching data");
    });

// async/await method
async function loadEvents() {

    try {
        // Show loading message
        loading.innerHTML = "Loading events...";

        // await waits for API response
        const response = await fetch(apiURL);

        // Convert response to JSON
        const events = await response.json();

        // Hide loading message
        loading.innerHTML = "";

        // Display only first 3 mock events
        events.slice(0, 3).forEach(function(event) {
            eventDetails.innerHTML += `
                Event Name: ${event.name}<br>
                Location: ${event.address.city}<br><br>
            `;
        });

    } catch (error) {
        // Display error if API fails
        loading.innerHTML = "Failed to load events";
    }
}

// Call async function
loadEvents();