// Task 3: Conditionals, Loops and Error Handling

// Array: stores multiple events
const events = [
    { name: "Health Camp", seats: 20, upcoming: true },
    { name: "Music Show", seats: 0, upcoming: true },
    { name: "Old Seminar", seats: 15, upcoming: false }
];

// Variable to store output
let output = "";

// forEach() loop: checks each event
events.forEach(function(event) {

    // if-else: show only upcoming events with seats
    if (event.upcoming && event.seats > 0) {

        output += `
        Event Name: ${event.name}<br>
        Available Seats: ${event.seats}<br><br>
        `;

    } else {

        // Hide past or full events
        output += `${event.name} is hidden<br><br>`;
    }
});

// try-catch: handles registration errors
try {

    // Select first event
    let selectedEvent = events[0];

    // Check seat availability
    if (selectedEvent.seats <= 0) {
        throw "No seats available";
    }

    output += "Registration Allowed";

} catch (error) {

    output += error;
}

// Display output on webpage
document.getElementById("eventDetails").innerHTML = output;