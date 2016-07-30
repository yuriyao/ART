$(document).ready(function(){

  //登陆
  $("#signin").click(function(){
  	var email = $("#inputEmail").val();
  	var password = $("#inputPassword").val();

   	$.post("/signin", { email: email, password : password },
        function(data){
          alert("Data Loaded: " + data);
      	}
    );
  });//sign is over


});