async function apiCallText(method, url, callback) {
    fetch(url, {
        method: method,
        headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        }
    ).then((response) => {
            return response.text();
        }
    ).then(callback);
}

async function apiCallJson(method, url, callback) {
    fetch(url, {
        method: method,
        headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        }
    ).then((response) => {
            return response.json();
        }
    ).then(callback);
}
