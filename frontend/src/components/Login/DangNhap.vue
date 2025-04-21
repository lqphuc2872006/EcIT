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
        <label>Password</label>
        <input class="form-control"  style="font-style: italic" placeholder="Password..." type="password" name="" id="">
      </div>
      <div class="forget-password">
        <a href="#">Register</a>
        <a href="#">Forget your password?</a>
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
  display: flex;
  justify-content: space-between;
  margin-bottom: 10px;
  text-decoration: none;

}
.forget-password a {

  text-decoration: none;
}


</style>