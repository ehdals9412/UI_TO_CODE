<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<%@page import="com.UTC.dto.MemberDto"%> 

<!DOCTYPE html>
<html lang="en">
<head>
<title>UTC</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <style type="text/css">
  
  body {
      font: 400 20px/1.8 Lato, sans-serif;
      color: black;
  }
  h3, h4 {
      margin: 10px 0 30px 0;
      letter-spacing: 10px;      
      font-size: 30px;
      color: black;
  }
  
  .carousel-inner img {
      -webkit-filter: grayscale(90%);
      filter: grayscale(90%); /* make all photos black and white */ 
      width: 100%; /* Set width to 100% */
      margin: auto;
  }

  textarea {
      resize: none;
  }
  
  </style>
</head>



<body id="myPage" data-spy="scroll">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
  <a class="navbar-brand" href="admin_main.jsp">UTC</a>
 </nav>


<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="img/kh1.jpg" style="width:100%">
        <div class="carousel-caption">
          <h3 style="color:black;">A Lot of Fun</h3>
          <p style="color:black;">We had a lot of fun having this project done.</p>
        </div>      
      </div>

      <div class="item">
        <img src="img/kh2.jpg" style="width:100%">
        <div class="carousel-caption">
          <h3 style="color:black;">Too Fun to Go to Sleep</h3>
          <p style="color:black;">Thanks to this project, we have not ready gone to sleep well. But after few tries, I found it is fun.
          From those days we're trying, we got way better than before.
          </p>
        </div>      
      </div>
	</div>
	
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>

<!-- Container (The Band Section) -->
<div id="band" class="container text-center">
  <h3>Semi-colon</h3>
  <p><em>홈페이지의 기능</em></p>
  <p>
	이미지를 활용하여 화면을 구성하고, 각 이미지가 나타내는 기능 및 총합된 결과물을 html 코드 형태로 변환해 제공한다<br/> 
	이미지의 크기, 배치 등을 수정 시 해당 형태로 변환된다<br/>
	각 사용자는 작업 중 임시 저장 및 관리가 가능하며, 완성된 작업물을 html 파일로 저장하여 보관할 수 있다<br/>
	다른 사용자와 작업물을 공유하고 의견을 나눌 수 있다

  </p>
  <br>
</div>

<!-- Container (Contact Section) -->
<div id="contact" class="container">
  
  
    <h3 class="text-center">Team Profile</h3>  
  <ul class="nav nav-tabs">
    <li class="active"><a data-toggle="tab" href="#home">WonSil</a></li>
    <li><a data-toggle="tab" href="#menu1">SeongEun</a></li>
    <li><a data-toggle="tab" href="#menu2">KyeongSoo</a></li>
    <li><a data-toggle="tab" href="#menu3">DongMin</a></li>
    <li><a data-toggle="tab" href="#menu4">KangIll</a></li>
    <li><a data-toggle="tab" href="#menu5">WooJoo</a></li>
  </ul>

  <div class="tab-content">
    <div id="home" class="tab-pane fade in active">
		<div class="container-fluid" style="margin-top:30px">
			<div class="row">
				<div class="col-md-4">
					<div align="left">
						<img class="img-circle" src="img/원실.jpeg" style="width:300px; height:300px" >
					</div>
				</div>
				<div class="col-md-8">
					<div>
						<h2>WonSil</h2>
								<p>DB 모델링 작업이 얼마나 중요한지 느꼈고, MVC2와 마이바티스에 대한 많은 공부가 되었습니다.
									UI구현과 ajax 등도 더 공부하고자 합니다.</p>
							</div>
				</div>
			</div>
		</div>
      
    </div>
   
    <div id="menu1" class="tab-pane fade">
    	<div class="container-fluid" style="margin-top:30px">
			<div class="row">
				<div class="col-md-4">
					<div align="left">
						<img class="img-circle" src="img/프로필대체.jpg" style="width:300px; height:300px" >
					</div>
				</div>
				<div class="col-md-8">
					<div>
						<h2>SeongEun</h2>
								<p>여럿이 하는 프로젝트에서 폐가 되지 않고 한 사람 몫을 하기 위해 더욱 공부해야겠다고 생각합니다.</p>
							</div>
				</div>
			</div>
		</div>
      
    </div>
    <div id="menu2" class="tab-pane fade">
    	<div class="container-fluid" style="margin-top:30px">
			<div class="row">
				<div class="col-md-4">
					<div align="left">
						<img class="img-circle" src="img/프로필대체.jpg" style="width:300px; height:300px" >
					</div>
				</div>
				<div class="col-md-8">
					<div>
						<h2>KyeongSoo</h2>
								<p>프로젝트를 통해 웹페이지 전반에 대한 이해도를 높일 수 있었습니다. 한편 시간 관계상 참여하지
									못했던 부분들이 있어서 아쉽고 팀원들에게 미안합니다.</p>

							</div>
				</div>
			</div>
		</div>
      
    </div>
     <div id="menu3" class="tab-pane fade">
    	<div class="container-fluid" style="margin-top:30px">
			<div class="row">
				<div class="col-md-4">
					<div align="left">
						<img class="img-circle" src="img/동민.jpeg" style="width:300px; height:300px" >
					</div>
				</div>
				<div class="col-md-8">
					<div>
						<h2>DongMin</h2>
      					<p>db를 중요하다고 생각하지 않았었는데 이번에 프로젝트를 하면서 db가 얼마나 중요한지 알았습니다</p>
					</div>
				</div>
			</div>
		</div>
     
    </div>
    <div id="menu4" class="tab-pane fade">
    	<div class="container-fluid" style="margin-top:30px">
			<div class="row">
				<div class="col-md-4">
					<div align="left">
						<img class="img-circle" src="img/강일.jpeg" style="width:300px; height:300px" >
					</div>
				</div>
				<div class="col-md-8">
					<div>
						<h2>KangIll</h2>
      					<p>역할 분담 및 각자 개발한 기능을 합치는 데 어려움이 있었기에 해당 부분에 대한 아쉬움이 남습니다.</p>
					</div>
				</div>
			</div>
		</div>
      
    </div>
    <div id="menu5" class="tab-pane fade">
       	<div class="container-fluid" style="margin-top:30px">
			<div class="row">
				<div class="col-md-4">
					<div align="left">
						<img class="img-circle" src="img/우주.jpeg" style="width:300px; height:300px" >
					</div>
				</div>
				<div class="col-md-8">
					<div>
						<h2>WooJoo</h2>
								<p>책임감을 가지고 프로젝트를 진행한다는 것의 중요함을 깨달았습니다.</p>
							</div>
				</div>
			</div>
		</div>
    </div>
  </div>



	<br>
	<br>
	<br>
	<br>
	<hr>
	
	<h3 class="text-center">Contact</h3>
  <p class="text-center"><em>KH 정보교육원 세미콜론!</em></p>
  <div class="row">
    <div class="col-md-4">
      <p>User? Drop a note.</p>
      <p><span class="glyphicon glyphicon-map-marker"></span>Gangnam, Seoul</p>
      <p><span class="glyphicon glyphicon-phone"></span>Phone: +82 01093629318</p>
      <p><span class="glyphicon glyphicon-envelope"></span>Email: mandoo180@gmail.com</p>
    </div>
    <div class="col-md-8">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea>
      <br>
      <div class="row">
        <div class="col-md-12 form-group">
          <button class="btn pull-right" type="submit">Send</button>
        </div>
      </div>
    </div>
  </div>
  <br>
</div>



<!-- Footer -->
<footer class="text-center">
  <a class="up-arrow" href="#myPage" data-toggle="tooltip" title="TO TOP">
    <span class="glyphicon glyphicon-chevron-up"></span>
  </a><br><br>
</footer>

<script type="text/javascript">
</script>

</body>
</html>
