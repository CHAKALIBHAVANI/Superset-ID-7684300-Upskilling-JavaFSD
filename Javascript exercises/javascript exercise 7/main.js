// Task 7: DOM Manipulation

// Event object data
const events = [
    { name: "Health Camp", seats: 20 }
];

// querySelector(): access container
const container = document.querySelector("#eventContainer");

// createElement(): create event card
const card = document.createElement("div");

// Display event details
card.innerHTML = `
    <h3>${events[0].name}</h3>
    <p>Seats: ${events[0].seats}</p>

    <button onclick="registerUser()">
        Register
    </button>

    <button onclick="cancelUser()">
        Cancel
    </button>
`;

// Append card to webpage
container.appendChild(card);

// Update UI after registration
function registerUser() {

    events[0].seats--;

    card.innerHTML = `
        <h3>${events[0].name}</h3>
        <p>Seats: ${events[0].seats}</p>

        <button onclick="registerUser()">Register</button>
        <button onclick="cancelUser()">Cancel</button>
    `;
}

// Update UI after cancellation
function cancelUser() {

    events[0].seats++;

    card.innerHTML = `
        <h3>${events[0].name}</h3>
        <p>Seats: ${events[0].seats}</p>

        <button onclick="registerUser()">Register</button>
        <button onclick="cancelUser()">Cancel</button>
    `;
}