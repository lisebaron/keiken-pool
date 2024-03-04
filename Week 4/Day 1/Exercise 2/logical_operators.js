alert( null || 2 || undefined ); // returns the first truthy value, so 2.
alert( alert(1) || 2 || alert(3) ); // alert(1) and then 2.