<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Elastic Login Form</title> 
    <link rel="stylesheet" href="css/style.css">
    
  </head>

  <body>

    <!--Google Font - Work Sans-->
<link href='https://fonts.googleapis.com/css?family=Work+Sans:400,300,700' rel='stylesheet' type='text/css'>

<div class="container">
  <div class="profile">
    <button id="toggleProfile">
        <img src="loginani.jpg">
    </button>
        
      <div class="profile__form" style="margin-bottom: -100px ; margin-top: 100px;">
          
      <div class="profile__fields">
      <form action="checkAdmin" method="post">
    
          <div class="field">
            
              <input  type="text" name="admin_id" id="fieldUser" class="input" required pattern=.*\S.* />
          <label for="fieldUser" class="label">Admin_UserId</label>
        </div>
        <div class="field">
            <input type="password"  name="adminpassword" id="fieldPassword" class="input" required pattern=.*\S.* />
          <label for="fieldPassword" class="label">Admin_Password</label>
        </div>
          <div class="field">
              <a href = "#" id = "forgotanchor" >Forgot Password</a>
          </div>
          
        <div class="profile__footer">
            <input type="submit" class="btn">
        </div>
          </form>
      </div>
     </div>
  </div>
    
</div>
    
        <script src="js/index.js"></script>

    
    
    
  </body>
</html>
