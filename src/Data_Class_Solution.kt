import kotlin.random.Random

fun main(){
val articles= arrayListOf<Article1>()
for (i in 1..10) {
    articles.add(getArticle())
}
val newArticles= arrayListOf<Article1>()
    for (article in articles){
        val newArticle=article.copy(title=article.title + "for my blog")
        articles.add((newArticle))
    }

    articles.forEach { println(it) }


}
fun getArticle():Article1{
    val randomTitle="Title" + Random.nextInt(100)
    val numberOfReaders=Random.nextInt(1000)
    return Article1(randomTitle,"Some content",numberOfReaders)

}


data class Article1(
    val title: String,
    val content: String,
    val numberOfReaders:Int

)