<script setup>

</script>

<template>
  <div class="container">
  <form class="form-add">
    <div class="login-form">
      <a>Thêm Intern</a>
      <div class="form-group">
        <label>UserName</label>
        <input type="text" style="font-style: italic" placeholder="UserName..." class="form-control" name="" id="">
      </div>
      <div class="form-group">
        <label>Email</label>
        <input class="form-control"  style="font-style: italic" placeholder="Email..." type="email" name="" id="">
      </div>
      <div class="form-group">
        <label>Phone</label>
        <input class="form-control"  style="font-style: italic" placeholder="Phone..." type="text" name="" id="">
      </div>
      <div class="form-group">
        <label>Password</label>
        <input class="form-control"  style="font-style: italic" placeholder="Password..." type="password" name="" id="">
      </div>

      <div class="form-group">
        <label>PasswordConfirm</label>
        <input class="form-control"  style="font-style: italic" placeholder="PasswordConfirm..." type="password" name="" id="">
      </div>
      <button type="submit">ADD</button>
    </div>
  </form>




  <table class="table">
    <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">First</th>
      <th scope="col">Last</th>
      <th scope="col">Handle</th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>John</td>
      <td>Doe</td>
      <td>@social</td>
    </tr>
    </tbody>
  </table>
  </div>
</template>

<style scoped>
.container{
  padding: 30px;
  display: flex;
  justify-content: space-between;
  gap: 50%;
}
.form-add{
  border-radius: 30px;
  padding: 30px;
  width: 100vw;
  box-shadow: 10px 10px 5px gray;
}
.form-add button{
  border: none;
  width: 100%;
  font-size: 20px;
  border-radius: 10px 5px;
  height: 40px;
  box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2);
  background: linear-gradient(to right, #a8ff78, #78ffd6);

}
.form-add a{
  font-weight: bold;
  font-size: 30px;
  justify-content: center;
  display: flex;
  margin-bottom: 10px;

}
.form-add button:active{
  transform: translateY(-5px);
}
.form-control{
  margin-bottom: 20px;
}

</style>