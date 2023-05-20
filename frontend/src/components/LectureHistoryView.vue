<template>

    <v-data-table
        :headers="headers"
        :items="lectureHistory"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'LectureHistoryView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            lectureHistory : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/lectureHistories'))

            temp.data._embedded.lectureHistories.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.lectureHistory = temp.data._embedded.lectureHistories;
        },
        methods: {
        }
    }
</script>

