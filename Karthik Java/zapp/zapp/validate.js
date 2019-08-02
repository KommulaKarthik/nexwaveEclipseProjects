function validate(){

var uname=document.forms["login"]["username"].value;
var pwd=document.forms["login"]["password"].value;

if(uname=="" || pwd==""){
alert("uname and pwd is mandatory");
return false;

}else{
alert("you have provided uname and password");
return true;
}



}