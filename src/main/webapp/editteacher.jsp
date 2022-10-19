<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title> Serrvlet Web App </title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

</head>

<body>

<div class="container">
  <jsp:include page="head.jsp"/>
  <div class="row mt-3">
    <div class="col-md-12">
      <div class="card">
        <div class="card-header">
          <div class="card-title"> Add Teacher  </div>
        </div>
        <div class="card-body">

          <form>


            <div class="mb-3">
              <label for="name" class="form-label">Full  Name </label>
              <input type="text" class="form-control" id="name" name="name"
                     aria-describedby="namelHelp">
              <div id="namelHelp" class="form-text">Enter your Full Name .
              </div>
            </div>





            <div class="mb-3">
              <label for="email" class="form-label">Email address</label>
              <input type="email" class="form-control" id="email" name="email"
                     aria-describedby="emailHelp">
              <div id="emailHelp" class="form-text">We'll never share your email with anyone else.
              </div>
            </div>


            <div class="mb-3">
              <label for="password" class="form-label">Enter your Password </label>
              <input type="text" class="form-control" id="password" name="password"
                     aria-describedby="passwordHelp">
              <div id="passwordlHelp" class="form-text">We'll never share your password  with anyone else.
              </div>
            </div>

            <div class="mb-3">
              <label for="dept" class="form-label">Enter your Depertment  </label>
              <input type="text" class="form-control" id="dept" name="dept"
                     aria-describedby="deptHelp">
              <div id="deptlHelp" class="form-text">Enter your Depertment Name
              </div>
            </div>


            <div class="mb-3 form-check">
              <input type="checkbox" class="form-check-input" id="exampleCheck1">
              <label class="form-check-label" for="exampleCheck1">Check me out</label>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
            <button type="reset" class="btn btn-primary">Reset</button>
            <a class="btn btn-danger" href="#" role="button">Cancle </a>


          </form>


        </div>
      </div>
    </div>


  </div>

</div>





<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>


</body>

</html>