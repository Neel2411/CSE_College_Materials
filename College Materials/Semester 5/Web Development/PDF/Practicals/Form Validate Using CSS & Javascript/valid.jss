// JavaScript Document
//rename the file with the name valid.js


<!--
// Form validation code will come here.
function validate()
{
 var uname=document.myForm.Name.value;
var zip = document.myForm.Zip.value;
var mail= document.myForm.EMail.value;
// var letters =/^[0-9a-zA-Z]+$/;
   if( document.myForm.Name.value == "" )
   {
     alert( "Please provide your name!" );
     document.myForm.Name.focus() ;
     //return false;
   }
   else
   {
	   allLetter(uname);
   }
   var pwd_len = document.myForm.passid.value.length;
  var min_len = 7;
  var max_len = 12;
	if(document.myForm.passid.value == "")
	{
		alert("Please enter password");
		document.myForm.passid.focus();
	}
		
	else if (pwd_len <= min_len || pwd_len > max_len) 
	{
		document.myForm.passid.focus();
	alert("Password should not be empty / length must be in between "+ min_len +" to " + max_len);
		return false;
	}
	
	if(document.myForm.gen[0].checked == false && document.myForm.gen[1].checked == false)
	{
		alert("Please select gender");
		document.myForm.gen[0].focus();
		
	}
	if( document.myForm.EMail.value == "" )
  	 {
	     alert( "Please provide your Email!" );
	     document.myForm.EMail.focus() ;
	    //return false;
	   }
  	 else
	   {
	   checkemail(mail);
	   }
 	if(document.myForm.Zip.value == "")
   	{
         document.myForm.Zip.focus() ;
        alert( "Please provide a zip in the format #####." );
	}
  
	 if( document.myForm.Country.value == "-1" )
  	 {
     	  alert( "Please provide your country!" );
	  document.myForm.Country.focus();
   
   	}
   	if(document.myForm.eng.checked==false && document.myForm.guj.checked==false)
  	 {
	   alert("check any option");
	   document.myForm.eng.focus(); 
	  }
 return false ;
}
function allLetter(inputtxt)  
  {  
  
  var letters = /^[A-Za-z]+$/;  
  //alert(uname.match(letters));
   if(inputtxt.match(letters))  
     {  
    //  return true;  
	 
     }  
   else  
     {  
	 alert("must enter charecter")
	 document.myForm.Name.focus() ;
     return false;  
     }  
  } 
  /*function alldigit(inpno)
  {
	  var numbers = /^[0-9]+$/;  
		if(inpno.match(numbers))  
		{  
		return true;  
		}  
		else   
		{  
		alert('ZIP code must have numeric characters only');  
		uzip.focus();  
		return false;  
		}  
  }*/
   function checkemail()
  {
 var eptrn="^[\\w-_\.]*[\\w-_\.]\@[\\w]\.+[\\w]$";
	 
	 
		if(document.myForm.EMail.value.match(eptrn))
		{
			
			uzip.focus();
			//return true;
		}
		else
		{
			alert("you have entered invalid email address");
					//mail.focus();
					return false;
		}

		
  }
//-->
