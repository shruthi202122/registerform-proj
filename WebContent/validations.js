
function myFunction(){
	console.log("inside myFunction()");
	var pwd1=document.getElementById("pwd1").value;
	console.log("pwd1="+pwd1);
	var pwd2=document.getElementById("pwd2").value;
	console.log("pwd2="+pwd2);
	var uname =document.getElementById("uname").value;  
	var age=document.getElementById("age").value; 
	var mbno=document.getElementById("no").value; 
	var gender=document.getElementById("gender").value;
	if(uname.trim()==""){
		document.getElementById("unameErr").style.display="inline";
	}
	else if(age.trim()==""){
		document.getElementById("ageErr").style.display="inline";
	}else if(gender.trim()==""){
		document.getElementById("genderErr").style.display="inline";
	}else if(mbno.trim()==""){
		document.getElementById("mbnoErr").style.display="inline";
	}else if(pwd1.trim()==""){
		document.getElementById("pwd1Err").style.display="inline";
	}else if(pwd2.trim()==""){
		document.getElementById("pwd2Err").style.display="inline";
	}
	else {
		document.getElementById("registerForm").submit();
	}
	
	
	

} 