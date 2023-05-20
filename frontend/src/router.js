
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CourseManager from "./components/listers/CourseCards"
import CourseDetail from "./components/listers/CourseDetail"
import CourseManager from "./components/listers/CourseCards"
import CourseDetail from "./components/listers/CourseDetail"

import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"
import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"

import LectureManager from "./components/listers/LectureCards"
import LectureDetail from "./components/listers/LectureDetail"
import LectureManager from "./components/listers/LectureCards"
import LectureDetail from "./components/listers/LectureDetail"

import CertificationManager from "./components/listers/CertificationCards"
import CertificationDetail from "./components/listers/CertificationDetail"
import CertificationManager from "./components/listers/CertificationCards"
import CertificationDetail from "./components/listers/CertificationDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/courses',
                name: 'CourseManager',
                component: CourseManager
            },
            {
                path: '/courses/:id',
                name: 'CourseDetail',
                component: CourseDetail
            },
            {
                path: '/courses',
                name: 'CourseManager',
                component: CourseManager
            },
            {
                path: '/courses/:id',
                name: 'CourseDetail',
                component: CourseDetail
            },

            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },
            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },

            {
                path: '/lectures',
                name: 'LectureManager',
                component: LectureManager
            },
            {
                path: '/lectures/:id',
                name: 'LectureDetail',
                component: LectureDetail
            },
            {
                path: '/lectures',
                name: 'LectureManager',
                component: LectureManager
            },
            {
                path: '/lectures/:id',
                name: 'LectureDetail',
                component: LectureDetail
            },

            {
                path: '/certifications',
                name: 'CertificationManager',
                component: CertificationManager
            },
            {
                path: '/certifications/:id',
                name: 'CertificationDetail',
                component: CertificationDetail
            },
            {
                path: '/certifications',
                name: 'CertificationManager',
                component: CertificationManager
            },
            {
                path: '/certifications/:id',
                name: 'CertificationDetail',
                component: CertificationDetail
            },




    ]
})
