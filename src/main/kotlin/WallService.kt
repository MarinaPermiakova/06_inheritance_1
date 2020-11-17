object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        post.id = if (posts.isNotEmpty())
            posts.last().id + 1
        else 1
        posts += post
        return posts.last()
    }
}