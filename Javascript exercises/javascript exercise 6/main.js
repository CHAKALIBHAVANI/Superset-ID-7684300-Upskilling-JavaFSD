
// Task 6: Arrays and Methods


// Array stores community events
let events = [];

// CREATE: Add events using .push()
events.push({ name: "Music Festival", category: "Music" });
events.push({ name: "Health Camp", category: "Health" });
events.push({ name: "Music Workshop", category: "Music" });

// UPDATE: Change event name
events[0].name = "Grand Music Festival";

// DELETE: Remove Health Camp
events = events.filter(function(event) {
    return event.name !== "Health Camp";
});

// READ: Show only music events
let musicEvents = events.filter(function(event) {
    return event.category === "Music";
});

// MAP: Format display cards
let displayEvents = musicEvents.map(function(event) {
    return "Event: " + event.name;
});

// Output
let output = "<h3>Music Events</h3>";

displayEvents.forEach(function(event) {
    output += event + "<br>";
});

document.getElementById("eventDetails").innerHTML = output;