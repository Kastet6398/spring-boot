function add() {
    fetch('/api/add', {
        method: 'POST',
        headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        }
    ).then();
}

function read() {
    fetch('/api/read', {
        method: 'GET',
        headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        }
    ).then((response) => {
            return response.text();
        }
    ).then((text) => {
            document.getElementById('number').innerText = text;
        }
    );
}
