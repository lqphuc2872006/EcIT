<script setup>

</script>

<template>
  <div class="login-form">
    <img src="@/assets/logoEcoit.jpg">
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
    <div class="forget-password">
      <a href="/dangnhap">Đã có tài khoản?</a>
    </div>
    <button type="submit">Login</button>
  </div>
</template>

<style scoped>

.login-form {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  z-index: 2;
  background: rgba(255, 255, 255, 0.9);
  padding: 30px;
  border-radius: 10px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
  text-align: center;
  width: 30%;
  height: auto;
}
.login-form button {
  padding: 10px 20px;
  border-radius: 8px 16px;
  background: linear-gradient(to right, #a8ff78, #78ffd6);
  color: #fff;
  border: none;
  font-size: 16px;
  font-weight: bold;
  cursor: pointer;
  box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2);
  transition: all 0.3s ease;
  width: 100%;
}
.login-form button:active{
  transform: translateY(-5px) ;
}


.login-form h1 {
  margin-bottom: 20px;
}

/* Định dạng nhóm input */
.form-group {
  margin-bottom: 15px;
  text-align: left;
}
.form-group label{
  margin-bottom: 5px;
}
.forget-password {
  justify-content: space-between;
  text-align: right;
  margin-bottom: 10px;

}
.forget-password a {

  text-decoration: none;
}


</style>