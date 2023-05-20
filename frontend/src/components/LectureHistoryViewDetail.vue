<template>

    <v-card outlined>
        <v-card-title>
            LectureHistory # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'LectureHistoryViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/lectureHistories/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

