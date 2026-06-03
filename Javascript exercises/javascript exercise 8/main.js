// Task 8: Event Handling

// Event data
const events = [
    { name: "Health Camp", category: "Health" },
    { name: "Music Festival", category: "Music" }
];

// Display events
function displayEvents(eventList) {

    let output = "";

    eventList.forEach(function(event) {

        output += `
            ${event.name}
            <button onclick="registerEvent()">Register</button>
            <br><br>
        `;
    });

    document.getElementById("eventDetails").innerHTML = output;
}

// onclick: Register button
function registerEvent() {
    alert("Registration Successful");
}

// onchange: Category filter
function filterEvents() {

    let category = document.getElementById("category").value;

    let filteredEvents = events.filter(function(event) {

        return category === "All" || event.category === category;
    });

    displayEvents(filteredEvents);
}

// keydown: Search event name
document.getElementById("searchBox").addEventListener("keydown", function() {

    let searchText = this.value.toLowerCase();

    let searchedEvents = events.filter(function(event) {

        return event.name.toLowerCase().includes(searchText);
    });

    displayEvents(searchedEvents);
});

// Initial display
displayEvents(events);