if ("0") {
    alert( 'Hello' );
} // alert will show, because "0" is truthy since it's a string

if (prompt("What is the \"official\" name of JavaScript?", "") === "ECMAScript") {
    alert("Right!");
} else {
    alert("You don't know? ECMAScript!");
}

let promptValue = +prompt();
if(promptValue > 0) {
    alert(1);
} else if(promptValue < 0) {
    alert(-1);
} else if(promptValue === 0) {
    alert(0);
}

let result = (a + b < 4) ? 'Below' : 'Over';

let message = (login == 'Employee') ? 'Hello' :
(login == 'Director') ? 'Greetings' :
(login == '') ? 'No Login' :
'';
