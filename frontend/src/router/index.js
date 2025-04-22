import { createRouter, createWebHistory } from 'vue-router'
import App from "@/App.vue";
import DangNhap from "@/components/Login/DangNhap.vue";

const routes = [
    { path: '/home', name: 'home'},
    { path: '/dangnhap', name: 'dangnhap', component: DangNhap }
]

const router = createRouter({
    history: createWebHistory(),
    routes,
})

export default router
