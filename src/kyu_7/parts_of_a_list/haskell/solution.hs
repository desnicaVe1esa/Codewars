module Codewars.G964.Partlist where

import Control.Applicative
import Data.List (inits, tails)

partlist :: [String] -> [(String, String)]
partlist = zip <$> trim . inits <*> trim . tails
  where
    trim = map unwords . init . tail