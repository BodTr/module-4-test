import './assets/tabler/css/tabler.min.css'
import './assets/tabler/css/tabler-flags.min.css'
import './assets/tabler/css/tabler-payments.min.css'
import './assets/tabler/css/tabler-vendors.min.css'
import './assets/tabler/css/demo.min.css'

import { createApp } from 'vue'
import router from './router'
import axios from 'axios'
import App from './App.vue'

window.axios = axios
axios.defaults.baseURL = import.meta.env.VITE_BASE_URL

const app = createApp(App)
app.use(router)

app.mount('#app')
import 'bootstrap/dist/js/bootstrap.js'