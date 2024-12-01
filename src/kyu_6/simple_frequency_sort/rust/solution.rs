use std::collections::HashMap;

fn solve(vec: &[i32]) -> Vec<i32> {
    let counts = vec.iter().fold(HashMap::new(), |mut acc, n| {
        *acc.entry(n).or_insert(0) += 1;
        acc
    });

    let mut nums = vec.to_vec();
    nums.sort_by(|a, b| {
        let x = counts.get(a).unwrap();
        let y = counts.get(b).unwrap();
        y.cmp(x).then(a.cmp(b))
    });

    nums
}