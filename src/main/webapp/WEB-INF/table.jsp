<!-- Tailwind CSS CDN -->
<script src="https://cdn.tailwindcss.com"></script>

<div class="p-6">
    <h2 class="text-2xl font-bold mb-4">Topics Table</h2>

    <div class="overflow-x-auto">
        <table class="min-w-full bg-white border border-gray-200 rounded-lg">

            <!-- Table Header -->
            <thead class="bg-gray-100">
            <tr>
                <th class="py-2 px-4 border">Topic ID</th>
                <th class="py-2 px-4 border">Title</th>
                <th class="py-2 px-4 border">Created At</th>
                <th class="py-2 px-4 border">Updated At</th>
                <th class="py-2 px-4 border">User ID</th>
            </tr>
            </thead>

            <!-- Table Body -->
            <tbody>

            <!-- Example Row (Static) -->
            <tr class="text-center">
                <td class="py-2 px-4 border">1</td>
                <td class="py-2 px-4 border">Sample Title</td>
                <td class="py-2 px-4 border">2026-04-01</td>
                <td class="py-2 px-4 border">2026-04-02</td>
                <td class="py-2 px-4 border">101</td>
            </tr>

            <!-- Dynamic Data using JSTL -->
            <c:forEach var="topic" items="${topics}">
                <tr class="text-center hover:bg-gray-50">
                    <td class="py-2 px-4 border">${topic.topicID}</td>
                    <td class="py-2 px-4 border">${topic.title}</td>
                    <td class="py-2 px-4 border">${topic.created_at}</td>
                    <td class="py-2 px-4 border">${topic.updated_at}</td>
                    <td class="py-2 px-4 border">${topic.userid}</td>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </div>
</div>
