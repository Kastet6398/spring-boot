function apiCallText(method, url, callback) {
    fetch(url, {
            method: method
        }
    ).then((response) => {
            return response.text();
        }
    ).then(callback);
}

function apiCallJson(method, url, callback) {
    fetch(url, {
            method: method
        }
    ).then((response) => {
            return response.json();
        }
    ).then(callback);
}
