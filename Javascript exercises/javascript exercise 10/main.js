// Task 10: Modern JavaScript Features

// const: event list does not need reassignment
const events = [
    { name: "Health Camp", category: "Health", seats: 20 },
    { name: "Music Festival", category: "Music", seats: 15 },
    { name: "Yoga Workshop", category: "Health", seats: 10 }
];

// Function with default parameter
function showEvents(category = "Health") {

    // Spread operator: clone event list before filtering
    let clonedEvents = [...events];

    // Filter events based on category
    let filteredEvents = clonedEvents.filter(event => event.category === category);

    let output = "<h3>Modern JS Event List</h3>";

    filteredEvents.forEach(event => {

        // Destructuring: extract object values
        const { name, category, seats } = event;

        output += `
            Event Name: ${name}<br>
            Category: ${category}<br>
            Seats: ${seats}<br><br>
        `;
    });

    document.getElementById("eventDetails").innerHTML = output;
}

// Function call
showEvents();