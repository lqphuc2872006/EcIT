import { createRouter, createWebHistory } from 'vue-router'
import App from "@/App.vue";
import DangNhap from "@/components/Login/DangNhap.vue";
import DangKy from "@/components/Login/DangKy.vue";
import NewIntern from "@/components/NhanVien/NewIntern.vue";

const routes = [
    { path: '/home', name: 'home'},
    { path: '/dangnhap', name: 'dangnhap', component: DangNhap },
    { path: '/dangky', name: 'dangky', component: DangKy },
    { path: '/nhanvien', name: 'nhanvien', component: NewIntern },
]

const router = createRouter({
    history: createWebHistory(),
    routes,
})

export default router
