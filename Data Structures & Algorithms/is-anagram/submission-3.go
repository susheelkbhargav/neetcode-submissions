import "slices"
func isAnagram(s string, t string) bool {
    if len(s) != len(t) {
        return false
    } else {
        charsT := []rune(t)
        charsS := []rune(s)
        slices.Sort(charsT)
        slices.Sort(charsS)
        for i := range(len(charsS)) {
            if(charsT[i] != charsS[i]) {
                return false
            } 
        }
        return true
    }
}
