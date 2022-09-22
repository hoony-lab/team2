<template>

    <v-data-table
        :headers="headers"
        :items="roomView"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'RoomViewView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "roomId", value: "roomId" },
                { text: "reservationId", value: "reservationId" },
                { text: "paymentId", value: "paymentId" },
                { text: "roomStatus", value: "roomStatus" },
                { text: "roomPrice", value: "roomPrice" },
                { text: "reviewCnt", value: "reviewCnt" },
                { text: "reservationStatus", value: "reservationStatus" },
                { text: "payStatus", value: "payStatus" },
            ],
            roomView : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/roomViews'))

            temp.data._embedded.roomViews.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.roomView = temp.data._embedded.roomViews;
        },
        methods: {
        }
    }
</script>

