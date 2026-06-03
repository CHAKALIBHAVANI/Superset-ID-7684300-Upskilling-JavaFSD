
// Task: Syntax, Data Types, and Operators


// String data type: stores event name
const eventName = "Community Health Camp";

// String data type: stores event date
const eventDate = "1 July 2026";

// Number data type: stores available seats
let availableSeats = 200;

// Boolean data type: checks registration status
let isRegistered = true;

// Store initial seats
let seatsBefore = availableSeats;

// Increment operator: organizer adds one extra seat
availableSeats++;
let seatsAfterIncrement = availableSeats;

// Decrement operator: one participant registers
if (isRegistered) {
    availableSeats--;
}

let seatsAfterRegistration = availableSeats;

// Template literals used to display event information
document.getElementById("eventDetails").innerHTML = `
    <h3>Event Details</h3>

    Event Name: ${eventName}<br>
    Event Date: ${eventDate}<br>
    Registration Status: ${isRegistered}<br><br>

    Seats Before Changes: ${seatsBefore}<br>
    Seats After Increment (++): ${seatsAfterIncrement}<br>
    Seats After Registration (--): ${seatsAfterRegistration}
`;