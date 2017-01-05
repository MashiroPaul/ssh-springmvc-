$.ajax({
	url:"loginjudge.do",
	type:"post",
	success:function(data){
		if(data==true){
			$("#icon-data").remove();
			$("#loginapi").remove();
			document.getElementById("user_img").style.display="block";
			document.getElementById("askquestion").style.display="block";
		}
		else{
			document.getElementById("user_img").style.display="";
		}
	}
});

var questionlist={};
$.ajax({
	url:"questionlist.do",
	type:"GET",
	datatype:"json",
	success:function(data){
		questionlist=JSON.parse(data);
		for(var i=0;i<questionlist.length;i++){
			$("#javaquestionlist").append("<div class='javadata'><div class='answernum'>"+ questionlist[i].qt_answernum +"回答</div>"
					+"<div class='readnum'>"+ questionlist[i].qt_readnum +"回答</div>"
					+"<section class='sectionpart'><article>"+ questionlist[i].user_username +"&nbsp"+ questionlist[i].qt_time +"时候回答</article>"
					+"<p>"+ questionlist[i].qt_title +"</p></section></div>"
					+"<div style='border-bottom:1px solid #EEC591;float:left;height:2px;width:100%;'></div>")
		}
	},
});

function show(){
	hidebg.style.display="block";  
	hidebg.style.height=document.body.clientHeight+"px";  
	document.getElementById("login").style.display="block";
}
function hide()  
{ 
   document.getElementById("login").style.display="none"; 
   document.getElementById("hidebg").style.display="none"; 
} 

function loginI()
{
	var login={};
	login.username = $("#login_username").val();
	login.password = $("#login_password").val();
//	alert(login.username);
	$.ajax({
		url:"login.do",
			data:{
				"name":login.username,
				"pwd":login.password
			},
			type:"POST",
			datatype:"json",
			success:function(data){
				if(data==true)
				{
					$("#login").hide();
					$("#hidebg").hide();
					$("#icon-data").remove();
					$("#loginapi").remove();
					document.getElementById("user_img").style.display="block";
					document.getElementById("askquestion").style.display="block";
				}
				else {alert("账号密码错误");}
			},
			error:function(data){
				window.location.href="error404.html";
			}
	});
}

function register(){
	var register={};
	register.username = $("#register_username").val();
	register.password = $("#register_password").val();
	$.ajax({
		url:"register.do",
		data:{
			"reg_username":register.username,
			"reg_password":register.password
		},
		type:"POST",
		datatype:"json",
		success:function(data){
			if(data==true){
				alert("success register");
			}
			else{
				alert("注册失败");
			}
		},
		error:function(data){
			alert("wrong");
		}		
	});
}

function quit(){
	$.ajax({
		url:"quit.do",
		type:"post",
		success:function(data){
			if(data=="success"){
				window.location.reload();
			}
		},
		error:function(data){
			location.href="error404.html";
		}
	});
}








