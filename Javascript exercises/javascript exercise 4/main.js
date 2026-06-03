// Task 4: Functions, Scope, Closures, Higher-Order Functions

// Array: stores all community events
const events = [];

// Function: adds a new event to the events array
function addEvent(name, category, seats) {
    events.push({ name: name, category: category, seats: seats });
}

// Closure: keeps total registrations private
function registrationCounter() {
    let totalRegistrations = 0;

    return function () {
        totalRegistrations++;
        return totalRegistrations;
    };
}

// Counter for health category registrations
const healthRegistrations = registrationCounter();

// Function: registers user for an event
function registerUser(eventName) {
    let event = events.find(e => e.name === eventName);

    if (event && event.seats > 0) {
        event.seats--;
        return "Registered for " + event.name;
    }

    return "Registration failed";
}

// Higher-order function: accepts callback for filtering
function filterEventsByCategory(callback) {
    return events.filter(callback);
}

// Add task-related events
addEvent("Health Camp", "Health", 20);
addEvent("Music Show", "Entertainment", 0);
addEvent("Yoga Workshop", "Health", 15);

// Register user
let registerMessage = registerUser("Health Camp");

// Closure count update
let totalHealthRegistrations = healthRegistrations();

// Callback: filters only health events with seats
let healthEvents = filterEventsByCategory(function(event) {
    return event.category === "Health" && event.seats > 0;
});

// Display output
let output = "<h3>Function Based Event Operations</h3>";

output += registerMessage + "<br>";
output += "Total Health Registrations: " + totalHealthRegistrations + "<br><br>";

healthEvents.forEach(function(event) {
    output += "Event Name: " + event.name + "<br>";
    output += "Category: " + event.category + "<br>";
    output += "Available Seats: " + event.seats + "<br><br>";
});

document.getElementById("eventDetails").innerHTML = output;