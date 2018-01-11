function validateRegistration() {
    var ide = [
        "first_name",
        "last_name",
        "email",
        "pass",
        "pass1"
    ];
    var regex = [
    	/^[a-zA-Z_\u00A1-\uFFFF_\s]{2,45}$/,
    	/^[a-zA-Z_\u00A1-\uFFFF_\s]{2,45}$/,
    	/^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/,
    	/^(?=.*[a-zšđžćč])(?=.*[A-ZŠĐŽĆČ])(?=.*\d.*)(?=.*\W.*)[a-zšđžćčA-ZŠĐŽĆČ0-9\S]{8,15}$/,
    	/^(?=.*[a-zšđžćč])(?=.*[A-ZŠĐŽĆČ])(?=.*\d.*)(?=.*\W.*)[a-zšđžćčA-ZŠĐŽĆČ0-9\S]{8,15}$/
    ];
    var message = [
        "Invalid name structure. Requirements: 2-45 characters, only lower and upper case letters and spaces.",
        "Invalid last name structure. Requirements: 2-45 characters, only lower and upper case letters and spaces.",
        "Invalid email structure. Requirements: classical email structure (like xxx@xxx.xxx).",
        "Invalid password structure. Requirements: 8-15 characters, at least 1 lower and upper case letter, a number and a special character (no spaces).",
        "Invalid password structure. Requirements: 8-15 characters, at least 1 lower and upper case letter, a number and a special character (no spaces)."
    ];
    for(var i=0; i<ide.length; i++)
        document.getElementById(ide[i]).style.borderColor = "green";
    
    var flag = 0;
    for(var i=0; i<ide.length; i++) {
        if((validateSingleOne(ide[i], regex[i], message[i])) != true) {
            flag++;
            break;
        }
    }
    if(flag != 0)
        return false;
    return true;
}
function validateUpdate() {
    var ret = false;
	
	var ide = [
    	"first_name",
    	"last_name"
    ];
	var regex = [
		/^[a-zA-Z_\u00A1-\uFFFF_\s]{2,45}$/,
    	/^[a-zA-Z_\u00A1-\uFFFF_\s]{2,45}$/
	];
	var message = [
		"Invalid name structure. Requirements: 2-45 characters, only lower and upper case letters and spaces.",
        "Invalid last name structure. Requirements: 2-45 characters, only lower and upper case letters and spaces."
	];
	for(var i=0; i<ide.length; i++)
        document.getElementById(ide[i]).style.borderColor = "green";
	
	var flag = 0;
    for(var i=0; i<ide.length; i++) {
        if((validateSingleOne(ide[i], regex[i], message[i])) != true) {
            flag++;
            break;
        }
    }
    if(flag != 0)
        ret = false;
    else 
    	ret = true;
    
    if(ret!=true)
    	return false;
    
    document.getElementById("pass").style.borderColor = "green";
	    
    if(document.getElementById("pass").value.length!=0) {
    	ret = validateSingleOne("pass", /^(?=.*[a-zšđžćč])(?=.*[A-ZŠĐŽĆČ])(?=.*\d.*)(?=.*\W.*)[a-zšđžćčA-ZŠĐŽĆČ0-9\S]{8,15}$/, "Invalid password structure. Requirements: 8-15 characters, at least 1 lower and upper case letter, a number and a special character (no spaces).");
    	if(ret!=true)
    		return false;
    }
    
    document.getElementById("pass1").style.borderColor = "green";
    
    if(document.getElementById("pass1").value.length!=0) {
    	ret = validateSingleOne("pass1", /^(?=.*[a-zšđžćč])(?=.*[A-ZŠĐŽĆČ])(?=.*\d.*)(?=.*\W.*)[a-zšđžćčA-ZŠĐŽĆČ0-9\S]{8,15}$/, "Invalid password structure. Requirements: 8-15 characters, at least 1 lower and upper case letter, a number and a special character (no spaces).");
    	if(ret!=true)
    		return false;
    }
    
    if(document.getElementById("i_file").files.length != 0) { //is there is a file
    	var fileNameAndPath = document.getElementById("i_file").value;
    	var fileName = fileNameAndPath.substring(12, fileNameAndPath.length);
    	    	
    	var endingNumber = fileName.lastIndexOf('.');
    	
        var ending = fileName.substring(endingNumber+1, fileName.length);
        
        if((ending=="jpg")||(ending=="jpeg")||(ending=="png")||(ending=="gif")) {
        	ret = true;
        } else {
        	ret = false;
        	var msg = "Only .jpg, .jpeg, .png and .gif files are supported!";
            document.getElementById("feedback_reg").innerHTML = msg.replace(/(.{54})/g, "$1<br />");
        }
    }
    return ret;
}
function validateLogin() {	
    var ide = [
        "email",
        "pass"
    ];
    var regex = [
    	/^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/,
    	/^(?=.*[a-zšđžćč])(?=.*[A-ZŠĐŽĆČ])(?=.*\d.*)(?=.*\W.*)[a-zšđžćčA-ZŠĐŽĆČ0-9\S]{8,15}$/
    ];
    var message = [
        "Invalid email structure. Requirements: classical email structure (like xxx@xxx.xxx).",
        "Invalid password structure. Requirements: 8-15 characters, at least 1 lower and upper case letter, a number and a special character (no spaces)."
    ];
    for(var i=0; i<ide.length; i++)
        document.getElementById(ide[i]).style.borderColor = "green";
    
    var flag = 0;
    for(var i=0; i<ide.length; i++) {
        if((validateSingleOne(ide[i], regex[i], message[i])) != true) {
            flag++;
            break;
        }
    }
    if(flag != 0)
        return false;
    return true;
}
function validateSingleOne(ide, regex, message) {
    var arrayValue = document.getElementById(ide).value;
    if((arrayValue == "")||(arrayValue.search(regex)==-1)) {
        document.getElementById(ide).style.borderColor = "red";
        document.getElementById("feedback_reg").innerHTML = message.replace(/(.{54})/g, "$1<br />");
        return false;
    }
    return true;
}