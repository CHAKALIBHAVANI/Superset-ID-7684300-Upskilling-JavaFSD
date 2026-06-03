
// Task 5: Objects and Prototypes


// Constructor Function: creates Event objects
function Event(name, date, seats) {

    // Properties of the object
    this.name = name;
    this.date = date;
    this.seats = seats;
}

// Prototype Method:
// Checks whether seats are available
Event.prototype.checkAvailability = function () {

    if (this.seats > 0) {
        return "Seats Available";
    } else {
        return "No Seats Available";
    }
};

// Create Event object
const event1 = new Event(
    "Community Health Camp",
    "10 July 2026",
    25
);

// Variable to store webpage output
let output = "<h3>Event Details</h3>";

// Object.entries() lists all keys and values
Object.entries(event1).forEach(function(item) {

    output += item[0] + " : " + item[1] + "<br>";
});

// Call prototype method
output += "<br>Availability Status: ";
output += event1.checkAvailability();

// Display output on webpage
document.getElementById("eventDetails").innerHTML = output;